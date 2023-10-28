package com.example.taller;
import java.util.ArrayList;


public class VerificarNombre {

    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<String>();


        listaNombres.add("Juan");
        listaNombres.add("Pedro");
        listaNombres.add("pepa");
        listaNombres.add("Luisa");


        if (listaNombres.contains("Carlos")) {
            System.out.println("Carlos está en la lista");
        } else {
            System.out.println("Carlos no está en la lista");
        }
    }
}
