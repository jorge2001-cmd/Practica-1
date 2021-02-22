package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float nuevo=0,suma=0,prom=0;
        System.out.println("programa para sacar promedio");
        Scanner n = new Scanner(System.in);
        System.out.println("ingrese la contidad de nota");
        int notas =n.nextInt();
        for (int i = 1; i <= notas; i++){
            Scanner o = new Scanner(System.in);
            System.out.println("ingrese la nota obtenida " + "{"+i+"}:");
            nuevo = o.nextFloat();
            suma= suma+nuevo;
            prom= suma/notas;
        }
        System.out.println("la suma es: " +suma);
        System.out.println("el promedio es: " +prom);
    }
}
