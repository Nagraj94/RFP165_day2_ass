package com.bridgelabz.basics;
import java.util.Scanner;

public class WhileLoop {
    Scanner sc = new Scanner(System.in);
    void sumOfNum(){
        System.out.println("enter number to find sum of natural number");
        int sum = 0;
        int num;
        int i = 1;
        num = sc.nextInt();
        while (i<=num){
            sum = sum + i;
            i++;
        }
        System.out.println("sum of natural is "+sum);
    }

    void revNum(){
        System.out.println("enter number to revers the number ");
        int number;
        int remainder;
        int reverse = 0;
        number = sc.nextInt();
        while (number !=0){
            remainder = number%10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("reverse of "+number+" is " +reverse);
    }

    public static void main(String[] args) {
     WhileLoop whileLoop = new WhileLoop();
     whileLoop.sumOfNum();
     whileLoop.revNum();
    }
}
