package dsa.patterns;

import java.util.Scanner;

public class Pattern16 {

    public static void main(String[] args) {

//        0 0 0 0 1 0 0 0 0
//        0 0 0 2 3 2 0 0 0
//        0 0 3 4 5 4 3 0 0
//        0 4 5 6 7 6 5 4 0
//        5 6 7 8 9 8 7 6 5
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            //Zero's
            for(int j=1; j<=num-i; j++){
                System.out.print(0);
                System.out.print(" ");
            }
            //increment
            for(int j=i; j<=(2*i)-1; j++){
                System.out.print(j);
                System.out.print(" ");
            }
            //decrement
            for(int j=(2*i)-2; j>=i; j--){
                System.out.print(j);
                if(i==num && j==num)
                {
                    break;
                }
                System.out.print(" ");
            }
            //Zero's
            for(int j=1; j<=num-i; j++){
                System.out.print(0);
                if(j==num-i)
                {}
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
