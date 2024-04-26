package com.mycompany.analitica;

import java.util.*;

public class Analitica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        int valor;
        int suma = 0;

        do {
            System.out.println("Digite un entero diferente a cero ó cero para finalizar: ");
            valor = sc.nextInt();
            valores.add(valor);
            suma += valor;
        } while (valor != 0);

        System.out.println("La suma es: " + suma);
        float prom = suma / valores.size();
        System.out.println("El promedio es: " + prom);
    }
}

