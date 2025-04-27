package org.example;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 5;
    private Object[] data = new Object[INIT_SIZE];
    private int indexLast = -1;

    public void add(T item){
        if(indexLast == data.length - 1){
            resize(data.length * 2);
        }

        data[++indexLast] = item;
    }

    public void remove(int index){
        if(index == indexLast){
            data[index] = null;
            indexLast--;
            return;
        }

        for(int i = index; i < indexLast; i ++){
            data[i] = data[i + 1];
        }

        data[indexLast--] = null;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return indexLast + 1;
    }
    private void resize(int newLength){
        Object[] newData = new Object[newLength];
        System.arraycopy(data, 0, newData, 0, indexLast);
        data = newData;
    }
}
