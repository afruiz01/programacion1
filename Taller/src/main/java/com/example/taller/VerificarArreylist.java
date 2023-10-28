package com.example.taller;

import java.util.ArrayList;

public class VerificarArreylist {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();


        if (lista.isEmpty()) {
            System.out.println("El ArrayList está vacío");
        } else {
            System.out.println("El ArrayList no está vacío");
        }
    }
}
