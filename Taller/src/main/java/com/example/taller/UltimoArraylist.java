package com.example.taller;
import java.util.ArrayList;

public class UltimoArraylist {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beto");
        nombres.add("David");

        if (!nombres.isEmpty()) {
            String ultimoElemento = nombres.get(nombres.size() - 1);
            System.out.println("Último elemento: " + ultimoElemento);
        } else {
            System.out.println("El ArrayList está vacío.");
        }
    }
}
