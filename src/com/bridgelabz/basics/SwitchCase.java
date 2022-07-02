package com.bridgelabz.basics;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);
     static final char A = 'A';
     static final char E = 'E';
    static final char I = 'I';
    static final char O = 'O';
    static final char U = 'U';
    static final char a = 'a';
    static final char e = 'e';
    static final char i = 'i';
    static final char o = 'o';
    static final char u = 'u';

    void vowelConsonant(){
        System.out.print("enter character to find it is a vowel or consonant: ");
        char ch = sc.next().charAt(0);
        sc.close();
        switch (ch){
            case A:
                System.out.println("'A' is an vowel");
                break;
            case E:
                System.out.println("'E' is an vowel");
                break;
            case I:
                System.out.println("'I' is an vowel");
                break;
            case O:
                System.out.println("'O' is an vowel");
                break;
            case U:
                System.out.println("'U' is an vowel");
                break;
            case a:
                System.out.println("'a' is an vowel");
                break;
            case e:
                System.out.println("'e' is an vowel");
                break;
            case i:
                System.out.println("'i' is an vowel");
                break;
            case o:
                System.out.println("'o' is an vowel");
                break;
            case u:
                System.out.println("'u' is an vowel");
                break;
            default:
                System.out.println(ch+" is a consonant");
                break;
        }
    }

    void monthName(){
        System.out.println("enter number between 1 to 12 to find month");
        int month = sc.nextInt();
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
    public static void main(String[] args) {
        SwitchCase switchCase = new SwitchCase();
        switchCase.vowelConsonant();
        switchCase.monthName();
    }
}
