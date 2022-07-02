package com.bridgelabz.operators;

import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        int temp;
        int temp1;
        int temp2;
        int temp3;
        int max;
        int max2;
        int min;
        int min2;
        int smallest;
        int largest;
        int a = 0;
        int b = 0;
        int c;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        a = sc.nextInt();
        System.out.print("enter first number: ");
        b = sc.nextInt();
        c = a;    //c = 34
        a = b;    //a = 96
        b = c;    //b = 34
        temp = a+b*c;
        temp1 = c+a/b;
        temp2 = a%b+c;
        temp3 = a*b+c;

        max = temp > temp1 ? temp:temp1;
        max2 = max > temp2 ? max:temp2;
        largest = max2 > temp3 ? max2:temp3;

        min = temp < temp1 ? temp:temp1;
        min2 = min < temp2 ? min:temp2;
        smallest = min2 < temp3 ? min2:temp3;
        System.out.println(" ");
        System.out.println("1) solution for a+b*c = "+temp);
        System.out.println("2) solution for c+a/b = "+temp1);
        System.out.println("3) solution for a%b+c = "+temp2);
        System.out.println("4) solution for a*b+c = "+temp3);
        System.out.println(" ");
        System.out.println("max "+largest);
        System.out.println(" ");
        System.out.println("min "+smallest);

    }
}
