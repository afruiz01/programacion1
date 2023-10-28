package com.example.taller;

import java.util.ArrayList;

public class ArraylistVacio {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 3; i++) {
            arrayList.add(new ArrayList<Integer>());
        }

        System.out.println("ArrayLists vacíos: " + arrayList);
    }
}
