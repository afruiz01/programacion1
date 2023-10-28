package com.example.taller;

import java.util.ArrayList;

public class EliminarArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();


        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(40);

        listaNumeros.clear();


        if (listaNumeros.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println("La lista no está vacía");
        }
    }
}
