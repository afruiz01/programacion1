package com.example.taller;

import java.util.ArrayList;

public class Cambiar_nombre {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();


        nombres.add("carlos");
        nombres.add("María");
        nombres.add("Luis");
        nombres.set(2, "Ana");


        System.out.println(nombres);
    }


}
