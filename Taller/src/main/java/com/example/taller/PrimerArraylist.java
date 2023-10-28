package com.example.taller;
import java.util.ArrayList;

public class PrimerArraylist {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beto");
        nombres.add("David");

        if (!nombres.isEmpty()) {
            String primerNombre = nombres.get(0);
            System.out.println("Primer nombre: " + primerNombre);
        } else {
            System.out.println("El ArrayList de nombres está vacío.");
        }
    }
}
