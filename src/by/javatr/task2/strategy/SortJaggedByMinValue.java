package by.javatr.task2.strategy;

public class SortJaggedByMinValue extends AbstractSortStrategy {
    @Override
    public void sortArray(int[][] array) throws Exception {
        if (array == null) {
            throw new Exception("Null array");
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (getMinElement(array[j]) > getMinElement(array[j + 1])) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public int getMinElement(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
