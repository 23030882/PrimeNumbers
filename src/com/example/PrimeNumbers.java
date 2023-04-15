package com.example;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("enter your value");
        n= input.nextInt();
        int count=0;
        for (int i=1; i<=n;i++) {
            if (n % i == 0){
                count++;
            }
        }
        if (count ==2) {
            System.out.println("is prime number "+ n);
        }else {
            System.out.println("Is not prime number "+n);


        }
    }
}
