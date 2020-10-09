package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //introduix quatre numeros
        System.out.println("introdueix 1 numero");
        // llegim el enter
        int numero = lector.nextInt();

        if (numero%2==0)
            System.out.println("El número es par");
        else
            System.out.println("El número es impar");

        if(numero>0)
            System.out.println("es positivo\n");
        else
            System.out.println("es negativo\n");

        System.out.println("introdueix 2 numero");
        // llegim el enter
        int num1 = lector.nextInt();
        int num2 = lector.nextInt();

        if(num1==num2)
            System.out.print("son numeros iguales"+"\n\n");
        if(num1>num2)
            System.out.print("el numero mayor es : "+num1+"\n\n");
        if(num2>num1)
            System.out.print("el numero mayor es : "+num2+"\n\n");

        System.out.println("introdueix 2 numero");
        // llegim el enter
        int a = lector.nextInt();
        int b = lector.nextInt();

        if(a>b) {
            new Scanner(System.in);
            int suma = a+b;
            int resta = a-b;
            int producte = a*b;
            int divisio = a/b;
            System.out.println(a + " + " +b+ "=" + suma);
            System.out.println(a + " - " +b+ "=" + resta);
            System.out.println(a + " * " +b+ "=" + producte);
            System.out.println(a + " / " +b+ "=" + divisio);
        }
        else {
            System.out.println("Error");
        }}}
