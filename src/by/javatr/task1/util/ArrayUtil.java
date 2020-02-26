package by.javatr.task1.util;

import by.javatr.task1.entity.Array;


public class ArrayUtil {
    public static Array searchFibonacci(Array array) throws Exception {
        if (array == null) {
            throw new Exception("Array is null");
        }
        Integer[] integers = Fibonacci.searchFibonacci(array.getCopy());
        return new Array(integers);
    }

    public static Array getPrimeNumbers(Array array) throws Exception {
        if (array == null) {
            throw new Exception("Array is null");
        }
        Integer[] result = PrimeNumber.getPrimeNumbers(array.getCopy());
        return new Array(result);
    }

    public static Array getThreeUniqNumberArray(Array array) throws Exception {
        if (array == null) {
            throw new Exception("Array is null");
        }
        Integer[] result = ThreeInteger.getNumbers(array.getCopy());
        return new Array(result);
    }
}
