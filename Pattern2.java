package dsa.patterns;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        //1
        //1_2
        //1_2_3
        //1_2_3_4
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i=1; i<=num1; i++){
            for(int j=1;j<=i; j++){
                if(j>=2){
                    System.out.print("_");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
