package session4;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class FiboCache {

    static private List<Long> fibsCached = new ArrayList<>();
    static private int fibsCompCount = 2;
    static private int fibsCachedCount = 0;

    static public void fiboCache() {
        fibsCached.add(0L);
        fibsCached.add(1L);
    }

    static public long getNthFib(int n) {
        if (n < fibsCached.size()){
            fibsCachedCount++;
            return fibsCached.get(n);
        }
        long result = getNthFib(n - 1) + getNthFib(n -2);
        fibsCached.add(result);
        fibsCompCount++;
        return result;
    }

    static public int getCountOfFibsComputed() {
        return fibsCompCount;
    }

    static public int getCountOfFibsCachedUsed() {
        return fibsCachedCount;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i=0; i< fibsCached.size() ; i++){
            builder.append(i==0 ? "": ", ");
            builder.append(fibsCached.get(i));
        }
        builder.append("]");
        return builder.toString();
    }

    //Unit tests to prove the method
    @Test
    public void testGet7thFib(){
        fiboCache();
        Assert.assertEquals(13, getNthFib(7));
    }

    @Test
    public void testGet19thFib(){
        fiboCache();
        Assert.assertEquals(4181, getNthFib(19));
    }

    @Test
    public void testGetFibsCachedFor7thFib(){
        fiboCache();
        getNthFib(7);
        Assert.assertEquals("[0, 1, 1, 2, 3, 5, 8, 13]", toString());
    }

    public static void main(String[] args) {
        fiboCache();
        System.out.println("The Fibonacci number requested is: " + getNthFib(15));
        System.out.println("The count of fibs computed is: " + getCountOfFibsComputed());
        System.out.println("The count of fibs cached used is: " + getCountOfFibsCachedUsed());
        FiboCache cache = new FiboCache();
        System.out.println("The Fibs cached are: " + cache);
    }
}

