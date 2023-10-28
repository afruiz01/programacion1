package com.example.taller;
import java.util.ArrayList;
public class NumerosEnteros {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(8);

        int maximo= numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > maximo) {
                maximo = numeros.get(i);
            }

        }

        System.out.println("El número más grande es: " + maximo);
    }
}


