package com.shiv;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
            Scanner in = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int n1 = in.nextInt();
            System.out.print("Enter second number: ");
            int n2 = in.nextInt();
            int sum = n1+n2;
            System.out.println("the sum = "+sum);

        }

    }

