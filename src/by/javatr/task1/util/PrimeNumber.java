package by.javatr.task1.util;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static Integer[] getPrimeNumbers(Integer[] array) throws Exception {
        if (array == null) {
            throw new Exception("Array is null");
        }
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            if (isPrime(i))
            {
                list.add(i);
            }
        }
        Integer[] result = new Integer[list.size()];
        list.toArray(result);
        return result;
    }

    public static boolean isPrime(int number) {
        boolean result;
        if (number < 2) {
            result = false;
        } else {
            result = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
