package dsa.patterns;

import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {

        //*
        //**
        //***
        //****
        //*****
        //******
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i=1; i<=num1; i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
