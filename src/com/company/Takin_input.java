package com.company;
import java.util.Scanner;

public class Takin_input {
    public static void main(String[] args) {
        System.out.println("Taking Input");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int a=sc.nextInt();
        System.out.println("Enter Number 2:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Number is:"+sum);


    }
}
