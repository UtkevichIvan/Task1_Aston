package org.example;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> a = new MyArrayList();
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }

        a.remove(2);

        for(int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}