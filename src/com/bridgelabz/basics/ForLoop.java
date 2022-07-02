package com.bridgelabz.basics;

import java.util.Scanner;

public class ForLoop {
    Scanner sc = new Scanner(System.in);
    void sum(){
        int a;
        System.out.println("***********************************");
        System.out.println("enter number to sum the natural number");
        a = sc.nextInt();
        int sum = 0;
        int i;
        for (i=1;i<=a;i++){
            sum = sum + i;
        }
        System.out.println("sum of natural number is: " +sum);
    }
    void rev(){
        int num;
        int rev = 0;
        System.out.println("******************************");
        System.out.println("enter number to reverse ");
        num = sc.nextInt();
        for (;num!=0;num=num/10){
            int remainder = num%10;
             rev = rev * 10 + remainder;
        }
        System.out.println("reverse of number: "+rev);
    }
    void palindrome(){
        int num;
        int rev = 0;
        System.out.println("******************************");
        System.out.println("enter number to reverse ");
        num = sc.nextInt();
        for (;num!=0;num=num/10){
            int remainder = num%10;
            rev = rev * 10 + remainder;
        }
        if(num.equals(rev)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {
       ForLoop forLoop = new ForLoop();
       //forLoop.sum();
       //forLoop.rev();
       forLoop.palindrome();
    }
}
