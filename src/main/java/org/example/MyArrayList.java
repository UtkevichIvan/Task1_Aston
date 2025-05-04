package org.example;

import java.util.Comparator;

/**
 * This class is my realization link{@link java.util.ArrayList}
 * @param <T> data type
 */
public class MyArrayList<T> {
    private static final int INIT_SIZE = 5;
    private Object[] data = new Object[INIT_SIZE];
    private int indexLast = -1;

    /**
     * This method inserts an object
     * @param item inserted object
     */
    public void add(T item){
        if(indexLast == data.length - 1){
            resize(data.length * 2);
        }

        data[++indexLast] = item;
    }

    /**
     *This method inserts an object by index
     * @param index index
     * @param item inserted object
     */
    public void add(int index, T item){
        if(index == indexLast + 1){
            if(indexLast == data.length - 1){
                resize(data.length * 2);
            }

            data[++indexLast] = item;
        }else if(index <= indexLast){
            if(indexLast == data.length - 1){
                resize(data.length * 2);
            }
            for(int i = indexLast; i >= index; i--){
                data[i + 1] = data[i];
            }

            data[index] = item;
            indexLast++;
        }
    }

    /**
     * This method deletes an object by index
     * @param index index
     */
    public void remove(int index){
        if(index != indexLast){
            for(int i = index; i < indexLast; i ++){
                data[i] = data[i + 1];
            }
        }

        data[indexLast--] = null;
    }

    /**
     * This method deletes all data
     */
    public void clear(){
        data = new Object[INIT_SIZE];
        indexLast = -1;
    }

    /**
     * This method sorts the data
     * @param c how should we sort the data
     * link{@link QuickSort#sort(MyArrayList, int, int, Comparator)}
     */
    public void sort(Comparator<? super T> c){
        QuickSort.sort(this, 0, size() - 1, c);
    }

    /**
     * This method returns the object by index.
     * @param index index
     * @return T object by index
     */
    public T get(int index){
        return (T)data[index];
    }

    /**
     * This method changes the value of an object by index.
     * @param index index
     * @param obj new value
     */
    public void set(int index, T obj){
        data[index] = obj;
    }

    /**
     * This method returns MyArrayList size.
     * @return int size
     */
    public int size(){
        return indexLast + 1;
    }

    /**
     * This method changes the length of the data.
     * @param newLength new length
     */
    private void resize(int newLength){
        Object[] newData = new Object[newLength];
        System.arraycopy(data, 0, newData, 0, indexLast);
        data = newData;
    }
}
