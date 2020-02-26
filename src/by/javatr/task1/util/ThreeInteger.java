package by.javatr.task1.util;

import by.javatr.task1.entity.Array;

import java.util.ArrayList;
import java.util.List;

public class ThreeInteger {
    public static boolean isRepeat(int n) {
        int a = n % 10;
        n /= 10;
        int b = n % 10;
        n /= 10;
        int c = n % 10;
        boolean res;
        res = a == b || b == c || a == c;
        return res;
    }

    public static Integer[] getNumbers(Integer[] array) throws Exception {
        if (array == null) {
            throw new Exception("Array is null");
        }
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (i > 99 && i < 1000 && !isRepeat(i)) {
                list.add(i);
            }
        }
        Integer[] result = new Integer[list.size()];
        list.toArray(result);
        return result;
    }
}
