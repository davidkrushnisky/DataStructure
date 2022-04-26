package session2;

import org.junit.Assert;
import org.junit.Test;

public class CustomArrayUnitTest {

    CustomArray target = new CustomArray();

    //Each time you do @Test, it creates a new instance of customArray, without the previously added elements. Starts from scratch.

    @Test
    public void testAddElement(){
        target.add(2);
        Assert.assertEquals(1, target.size());
    }

    @Test
    public void testDeleteByIndex(){
        target.add(2);
        target.deleteByIndex(0);
        Assert.assertEquals(0, target.size());
    }

    @Test
    public void testDeleteByValue(){
        target.add(20);
        boolean actual = target.deleteByValue(20);
        Assert.assertTrue(actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundException() {
        target.get(10);
    }
}
