package by.javatr.task2.strategy;

public abstract class AbstractSortStrategy {
    public abstract void sortArray(int[][]arr) throws Exception;

    public static void swap(int[][] arr, int index_left, int index_right) throws Exception {
        if (arr == null) {
            throw new Exception("Null array");
        }
        if (index_left > index_right || index_left >= arr.length) {
            throw new Exception("Wrong parameters");
        }
        int[] temp = arr[index_left];
        arr[index_left] = arr[index_right];
        arr[index_right] = temp;
    }
}
