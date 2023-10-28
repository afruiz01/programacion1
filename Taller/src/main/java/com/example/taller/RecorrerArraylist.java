package com.example.taller;

import java.util.ArrayList;

public class RecorrerArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(40);


        for (int numero : listaNumeros) {
            System.out.println(numero);
        }
    }
}
