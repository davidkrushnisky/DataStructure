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

    static public List<Long> getFibsCached() {
        return fibsCached;
    }

    //Create Unit test to prove the method
    @Test
    public void testGet7thFib(){
        FiboCache.fiboCache();
        Assert.assertEquals(13, getNthFib(7));
    }

    @Test
    public void testGet19thFib(){
        FiboCache.fiboCache();
        Assert.assertEquals(4181, getNthFib(19));
    }

    public static void main(String[] args) {
        FiboCache.fiboCache();
        System.out.println("The Fibonacci number is: " + getNthFib(15));
        System.out.println("The count of fibs computed is: " + getCountOfFibsComputed());
        System.out.println("The count of fibs cached used is: " + FiboCache.getCountOfFibsCachedUsed());
        System.out.println("The fibs cached are: " + FiboCache.getFibsCached());
    }
}

