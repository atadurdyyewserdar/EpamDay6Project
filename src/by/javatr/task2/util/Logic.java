package by.javatr.task2.util;

public class Logic {
    public static void sortJaggedArrayBySummary(int[][] array) throws Exception {
        if (array == null)
        {
            throw new Exception("Null array");
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (getSumOfRow(array[j]) > getSumOfRow(array[j + 1])) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void sortJaggedArrayMaxValue(int[][] array) throws Exception {
        if (array == null)
        {
            throw new Exception("Null array");
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (getMaxElement(array[j]) > getMaxElement(array[j + 1])) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void sortJaggedArrayMinValue(int[][] array) throws Exception {
        if (array == null)
        {
            throw new Exception("Null array");
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (getMaxElement(array[j]) < getMaxElement(array[j + 1])) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[][] arr, int index_left, int index_right) throws Exception {
        if (arr == null)
        {
            throw new Exception("Null array");
        }
        if (index_left > index_right || index_left >= arr.length)
        {
            throw new Exception("Wrong parameters");
        }
        int[] temp = arr[index_left];
        arr[index_left] = arr[index_right];
        arr[index_right] = temp;
    }

    public static int getSumOfRow(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static int getMaxElement(int[] arr)
    {
        int max = arr[0];
        for (int value : arr) {
            if (value > max)
            {
                max = value;
            }
        }
        return max;
    }
}
