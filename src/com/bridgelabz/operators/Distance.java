package com.bridgelabz.operators;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x;
        int y;
        int distance;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        distance = (int) Math.sqrt(x*x + y*y);
        System.out.println(distance);
    }
}
