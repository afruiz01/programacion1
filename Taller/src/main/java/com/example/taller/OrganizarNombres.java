package com.example.taller;
import java.util.ArrayList;
import java.util.Collections;


public class OrganizarNombres {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beto");
        nombres.add("David");

        Collections.sort(nombres);

        System.out.println("Nombres ordenados : " + nombres);
    }
}
