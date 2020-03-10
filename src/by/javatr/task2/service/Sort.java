package by.javatr.task2.service;

import by.javatr.task2.strategy.SortStrategy;

public class Sort {
    private SortStrategy sortStrategy;

    public Sort(SortStrategy sortStrategy) throws Exception {
        if (sortStrategy == null){
            throw new Exception("given ref is null");
        }
        this.sortStrategy = sortStrategy;
    }

    public void sortArray(int[][] array) throws Exception {
        if (array == null){
            throw new Exception("given ref is null");
        }
        sortStrategy.sort(array);
    }

    public void changeStrategy(SortStrategy sortStrategy) throws Exception {
        if (sortStrategy == null){
            throw new Exception("given ref is null");
        }
        this.sortStrategy = sortStrategy;
    }

    public void sortArray(int[][] array, SortStrategy sortStrategy) throws Exception {
        if (sortStrategy == null || array == null){
            throw new Exception("given ref is null");
        }
        this.sortStrategy = sortStrategy;
        this.sortStrategy.sort(array);
    }
}
