package by.javatr.task2.service;

import by.javatr.task2.strategy.AbstractSortStrategy;

public class Sort {
    private AbstractSortStrategy sortStrategy;

    public Sort(AbstractSortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }

    public void sortArray(int[][] array) throws Exception {
        sortStrategy.sortArray(array);
    }

    public void changeStrategy(AbstractSortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }
}
