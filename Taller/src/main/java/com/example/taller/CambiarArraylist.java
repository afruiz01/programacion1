package com.example.taller;

import java.util.ArrayList;

public class CambiarArraylist {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beto");
        nombres.add("David");

        for (int i = 0; i < nombres.size(); i++) {
            nombres.set(i, "Hola");
        }

        System.out.println("nuevo arraylist: " + nombres);
    }
}
