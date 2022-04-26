package session3;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListUnitTest {

    LinkedListArrayOfString target = new LinkedListArrayOfString();

    @Test
    public void testAdd(){
        target.addToFront("Toto");
        target.addToFront("suzy");

        Assert.assertEquals("suzy", target.get(0));
    }
}
