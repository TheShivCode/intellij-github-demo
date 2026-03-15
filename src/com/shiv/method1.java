package com.shiv;
import java.util.Scanner;
public class method1 {
    public static void main(String[] args) {
        //Q: take input of two number and print the sum
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        int sum = n1+n2;
        System.out.println("the sum = "+sum);


    }
}
