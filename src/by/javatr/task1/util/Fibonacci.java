package by.javatr.task1.util;

import by.javatr.task1.entity.Array;

import java.util.HashSet;
import java.util.Set;

public class Fibonacci {
    public static Integer[] searchFibonacci(Integer[] array) throws Exception {
        if (array == null) {
            throw new Exception("Array is null");
        }
        Set<Integer> setOfIntegers = new HashSet<>();
        for (int i : array) {
            if (isFibonacci(i)) {
                setOfIntegers.add(i);
            }
        }
        Integer[] result = new Integer[setOfIntegers.size()];
        setOfIntegers.toArray(result);
        return result;
    }

    public static boolean isFibonacci(int w) {
        double X1 = 5 * Math.pow(w, 2) + 4;
        double X2 = 5 * Math.pow(w, 2) - 4;
        long X1_sqrt = (long) Math.sqrt(X1);
        long X2_sqrt = (long) Math.sqrt(X2);
        return (X1_sqrt * X1_sqrt == X1) || (X2_sqrt * X2_sqrt == X2);
    }
}
