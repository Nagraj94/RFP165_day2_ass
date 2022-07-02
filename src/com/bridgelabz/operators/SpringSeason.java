package com.bridgelabz.operators;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        int month;
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for month ");
        month = sc.nextInt();
        System.out.println("enter number for day ");
        day = sc.nextInt();;
        if (month >= 3 && day >= 20 || month <= 6 && day <= 20){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
