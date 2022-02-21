package com.company;

public class Main {

    public static void main(String[] args) {
        int c = 0;
        try {
            int a = 8;
            int b = 0;
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println(c);
    }
    }
