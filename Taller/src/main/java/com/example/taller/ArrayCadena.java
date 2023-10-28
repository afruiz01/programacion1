package com.example.taller;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCadena {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beto");
        nombres.add("David");

        String[] array = nombres.toArray(new String[nombres.size()]);

        System.out.println("Array de nombres: " + Arrays.toString(array));
    }
}
