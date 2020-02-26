package by.javatr.task1.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task1.Service.ArrayService;
import by.javatr.task1.entity.Array;
import by.javatr.task1.util.ArrayUtil;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Integer[] arr1 = new Integer[10];
        Integer[] arr2 = new Integer[5];
        Integer[] arr3 = new Integer[5];

        ArrayService.randomizeArray(arr1);
        ArrayService.randomizeArray(arr2);
        ArrayService.randomizeArray(arr3);

        Array[] arrays = new Array[3];
        arrays[0] = new Array(arr1);
        arrays[1] = new Array(arr2);
        arrays[2] = new Array(arr3);

        arrays[0].bubbleSort();
        arrays[1].shellSort();
        arrays[2].insertionSort();

        System.out.println("Sorted arrays");
        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
        System.out.println(arrays[2]);

        System.out.println("index of Max element in array[0] : " + arrays[0].getMax());
        System.out.println("index of Min element in array[0] ; " + arrays[0].getMin());

        System.out.println("Prime numbers in array[0] : " + ArrayUtil.getPrimeNumbers(arrays[0]));
        System.out.println("Fibonacci numbers found in array[0] : " +ArrayUtil.searchFibonacci(arrays[0]));
        System.out.println("Three uniq decimal numbers in array[0] : " + ArrayUtil.getThreeUniqNumberArray(arrays[0]));

        if (args!=null)
        {
            System.out.println("COMMAND LINE");
            Array arrayCmd = ArrayService.fromCmd(args);
            System.out.println(arrayCmd);
            System.out.println("From file: ");
            Array arraFile = ArrayService.fromFile("/resources/file.txt");
            System.out.println(arraFile);
        }

    }
}
