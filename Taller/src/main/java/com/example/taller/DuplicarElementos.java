package com.example.taller;

import java.util.ArrayList;

public class DuplicarElementos {

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        // Agregar números a la lista
        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(40);

        // Duplicar todos los elementos de la lista
        ArrayList<Integer> listaDuplicada = new ArrayList<Integer>();
        for (int numero : listaNumeros) {
            listaDuplicada.add(numero * 2);
        }

        // Mostrar la lista duplicada
        for (int numero : listaDuplicada) {
            System.out.println(numero);
        }
    }
}

