package session4;

import java.util.ArrayList;
import java.util.List;

public class FiboCache {

    public static void main(String[] args) {
        fiboCache();
        System.out.println(getNthFib(45));
        System.out.println(getCountOfFibsComputed());
        System.out.println(getFibsCached());
    }

    static private List<Long> fibsCached = new ArrayList<>(); // NOT a HashMap !
    static private int fibsCompCount = 2;

    static public void fiboCache() {
        fibsCached.add(0L);
        fibsCached.add(1L);
    }

    static public long getNthFib(int n) {
        if (n < fibsCached.size()){
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

    static public List<Long> getFibsCached() {
        return fibsCached;
    }

    //Create Unit test to prove the method

}
