package com.bridgelabz.operators;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int x;
        int equ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = sc.nextInt();

        equ = (int) Math.sqrt(a*x*x + b*x + c);
        System.out.println(equ);
    }
}
