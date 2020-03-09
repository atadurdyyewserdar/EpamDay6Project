package by.javatr.task2.strategy;

public class SortJaggedBySummary extends AbstractSortStrategy {
    @Override
    public void sortArray(int[][] array) throws Exception {
        if (array == null) {
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

    public int getSumOfRow(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}
