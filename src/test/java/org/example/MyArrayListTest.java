package org.example;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @org.junit.jupiter.api.Test
    void add() {
        MyArrayList<Integer> test = new MyArrayList();
        test.add(5);
        assertEquals(1, test.size());
        assertEquals(5, test.get(0));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        MyArrayList<Integer> test = new MyArrayList();
        test.add(5);
        test.add(4);
        test.remove(0);
        assertEquals(1, test.size());
        assertEquals(4, test.get(0));
    }

    @org.junit.jupiter.api.Test
    void clear() {
        MyArrayList<Integer> test = new MyArrayList();
        test.add(5);
        test.add(4);
        test.clear();
        assertEquals(0, test.size());
    }

    @org.junit.jupiter.api.Test
    void sort() {
        MyArrayList<Integer> test = new MyArrayList();
        test.add(5);
        test.add(4);
        test.add(6);
        test.add(1);
        test.sort(Comparator.comparing(Integer::intValue));
        assertEquals(1, test.get(0));
        assertEquals(4, test.get(1));
        assertEquals(5, test.get(2));
        assertEquals(6, test.get(3));
        assertEquals(4, test.size());
    }

    @org.junit.jupiter.api.Test
    void get() {
        MyArrayList<Integer> test = new MyArrayList();
        test.add(5);
        test.add(4);
        test.add(6);
        assertEquals(6, test.get(2));
    }

    @org.junit.jupiter.api.Test
    void set() {
        MyArrayList<Integer> test = new MyArrayList();
        test.add(5);
        test.add(4);
        test.add(6);
        test.set(0, 1);
        assertEquals(1, test.get(0));
    }

    @org.junit.jupiter.api.Test
    void size() {
        MyArrayList<Integer> test = new MyArrayList();
        test.add(5);
        test.add(4);
        test.add(6);
        assertEquals(3, test.size());
    }
}