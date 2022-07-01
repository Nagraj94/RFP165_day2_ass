package com.bridgelabz.basics;

import java.util.Scanner;

public class IfElseLoop {
    public static void main(String[] args) {
        int a;
        System.out.print("enter single digit number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a==1)
            System.out.println(a+" = one");
        else if (a==2)
            System.out.println(a+" = two");
        else if (a==3)
            System.out.println(a+" = three");
        else if (a==4)
            System.out.println(a+" = four");
        else if (a==5)
            System.out.println(a+" = five");
        else if (a==6)
            System.out.println(a+" = six");
        else if (a==7)
            System.out.println(a+" = seven");
        else if (a==8)
            System.out.println(a+" = eight");
        else if (a==9)
            System.out.println(a+" = nine");
        else
            System.out.println(a+" = zero");
    }
}
