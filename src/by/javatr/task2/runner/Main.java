package by.javatr.task2.runner;

import by.javatr.task2.service.Sort;
import by.javatr.task2.strategy.SortJaggedByMaxValue;
import by.javatr.task2.strategy.SortJaggedByMinValue;
import by.javatr.task2.strategy.SortJaggedBySummary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        arr[0] = new int[]{1,2,3,55};
        arr[1] = new int[]{1,2,3,55,34};
        arr[2] = new int[]{5, 6,4};
        arr[3] = new int[]{5, 6,452,23};
        arr[4] = new int[]{5, 6,34,3};
        arr[5] = new int[]{5, 6,34,5,23,5,23};
        arr[6] = new int[]{5, 6,3,4,5,3,3};
        arr[7] = new int[]{5, 6,32,3,876,45,63};
        arr[8] = new int[]{5, 6,45,3,46,443,4};
        arr[9] = new int[]{5, 6,345,345,2,3};

        try {
            Sort sort = new Sort(new SortJaggedByMaxValue());
            sort.sortArray(arr);
            System.out.println(Arrays.deepToString(arr));
            sort.changeStrategy(new SortJaggedByMinValue());
            sort.sortArray(arr);
            System.out.println(Arrays.deepToString(arr));
            sort.changeStrategy(new SortJaggedBySummary());
            sort.sortArray(arr);
            System.out.println(Arrays.deepToString(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
