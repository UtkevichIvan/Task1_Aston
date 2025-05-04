package org.example;

import java.util.Comparator;

/**
 * This class is my realization QuickSort
 */
public class QuickSort {
    /**
     *
     * @param data sorted data
     * @param low start of sorted data
     * @param high end of sorted data
     * @param c how should we sort the data
     * @param <T> data type
     */
    public static <T> void sort(MyArrayList<T> data, int low, int high, Comparator<? super T> c) {
        if (data.size() == 0 || low >= high) return;

        int middle = low + (high - low) / 2;
        T border = data.get(middle);

        int i = low, j = high;
        while (i <= j) {
            while (c.compare(data.get(i), border) < 0) i++;
            while (c.compare(data.get(j), border) > 0) j--;
            if (i <= j) {
                T swap = data.get(i);
                data.set(i, data.get(j));
                data.set(j, swap);
                i++;
                j--;
            }
        }

        if (low < j) sort(data, low, j, c);
        if (high > i) sort(data, i, high, c);
    }
}
