package com.example.rprt1z2;

import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        System.out.printf("Unesite zeljeni broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        System.out.println("Brojevi djeljivi sumom svojih cifara su: ");

        for(int i = 1; i <= n; ++i) {
            if (i % sumaCifara(i) == 0) {
                System.out.printf("%d ", i);
            }
        }

    }

    static int sumaCifara(int broj) {
        int suma;
        for(suma = 0; broj != 0; broj /= 10) {
            int cifra = broj % 10;
            suma += cifra;
        }

        return suma;
    }
}
