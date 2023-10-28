package com.example.taller;
import java.util.ArrayList;


public class TerceroLista {

    public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> numeros = new ArrayList<>();
            numeros.add(1);
            numeros.add(2);
            numeros.add(3);
            numeros.add(4);
            numeros.add(5);

            if (numeros.size() >= 3) {
                int tercerElemento = numeros.get(2);
                System.out.println("El tercer elemento es: " + tercerElemento);
            } else {
                System.out.println("No hay suficientes elementos en la lista.");


            }
        }
    }
}