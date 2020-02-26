package by.javatr.task1.entity;

import java.util.Arrays;

public class Array {
    private Integer[] integers;

    public Array() {
    }

    public Array(Integer[] integers) throws Exception {
        setIntegers(integers);
    }

    public Array(int length) throws Exception {
        if (length < 0) {
            throw new Exception("Wrong size");
        }
        this.integers = new Integer[length];
    }

    public void setIntegers(Integer[] integers) throws Exception {
        if (integers == null) {
            throw new Exception("Array is null");
        }
        this.integers = Arrays.copyOf(integers, integers.length);
    }

    public int getValueAt(int index) throws Exception {
        if (index < 0 || index >= integers.length) {
            throw new Exception("Index out of bound");
        }
        return integers[index];
    }

    public void fill(int value) throws Exception {
        if (integers == null) {
            throw new Exception("Array is null");
        }
        Arrays.fill(integers, value);
    }


    public Integer[] getCopy() throws Exception {
        if (integers == null) {
            throw new Exception("Array is null");
        }
        return Arrays.copyOf(this.integers, this.integers.length);
    }

    /*
     * Returns the index of minimal element
     */
    public int getMin() throws Exception {

        if (this.integers == null) {
            throw new Exception("Array is null");
        }
        int index = 0;
        for (int i = 0; i < this.integers.length; i++) {
            if (this.integers[i] < this.integers[index]) {
                index = i;
            }
        }
        return index;
    }

    /*
     * Returns the index of max element
     */
    public int getMax() throws Exception {
        if (this.integers == null) {
            throw new Exception("Array is null");
        }
        int index = 0;
        for (int i = 0; i < this.integers.length; i++) {
            if (this.integers[i] > this.integers[index]) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public boolean equals(Object o) {
        boolean res;
        if (this == o) {
            res = true;
        } else if (o == null || getClass() != o.getClass()) {
            res = false;
        } else {
            Array array = (Array) o;
            res = false;
            if (array.integers.length == this.integers.length) {
                res = true;
                for (int i = 0; i < this.integers.length; i++) {
                    if (!this.integers[i].equals(array.integers[i])) {
                        res = false;
                        break;
                    }
                }
            }
        }
        return res;
    }

    @Override
    public int hashCode() {
        int result = 0;
        if (this.integers != null) {
            for (Integer i : integers) {
                result = i.hashCode();
            }
        }
        result *= 31;
        return result;
    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(getClass().getName());
        if (integers == null) {
            str.append("{ integers = [ null ] }");
        } else if (integers.length == 0) {
            str.append("{ integers = [ ] }");
        } else {
            str.append("{ integers = [ ");
            for (int i = 0; i < integers.length; i++) {
                str.append(String.valueOf(integers[i]));
                if (i == integers.length - 1) {
                    str.append(" ] }");
                    break;
                }
                str.append(", ");
            }
        }
        return str.toString();
    }

    public void bubbleSort() throws Exception {
        if (this.integers == null) {
            throw new Exception("Array is null");
        }
        for (int i = 0; i < integers.length - 1; i++) {
            for (int j = 0; j < integers.length - i - 1; j++) {
                if (integers[j] > integers[j + 1]) {
                    int temp = integers[j];
                    integers[j] = integers[j + 1];
                    integers[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSort() throws Exception {
        if (this.integers == null) {
            throw new Exception("Array is null");
        }
        int n = integers.length;
        for (int i = 1; i < n; ++i) {
            int key = integers[i];
            int j = i - 1;
            while (j >= 0 && integers[j] > key) {
                integers[j + 1] = integers[j];
                j = j - 1;
            }
            integers[j + 1] = key;
        }
    }

    public void shellSort() throws Exception {
        if (this.integers == null) {
            throw new Exception("Array is null");
        }
        if (integers.length < 1) return;
        for (int i = 0; i < integers.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[j] < integers[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = integers[min_idx];
            integers[min_idx] = integers[i];
            integers[i] = temp;
        }
    }

    public int binarySearch(int elementToSearch) throws Exception {
        if (integers == null) {
            throw new Exception("Integer array is null");
        }
        int firstIndex = 0;
        int lastIndex = integers.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (integers[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (integers[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

            else if (integers[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;
        }
        return -1;
    }
}
