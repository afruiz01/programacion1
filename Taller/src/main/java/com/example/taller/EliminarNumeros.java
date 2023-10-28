package com.example.taller;

import java.util.ArrayList;

public class EliminarNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
                i--;
            }
        }

        System.out.println(numeros); // Resultado: [1, 3, 5]
    }
}
