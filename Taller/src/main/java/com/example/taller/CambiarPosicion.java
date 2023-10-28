package com.example.taller;
import java.util.ArrayList;

public class CambiarPosicion {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();


        nombres.add("Juan");
        nombres.add("Carlos");
        nombres.add("Luis");


        nombres.set(1, "Pedro");


        System.out.println(nombres);
    }
}
