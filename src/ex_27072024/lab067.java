package ex_27072024;

import java.util.Scanner;

public class lab067 {
    public static void main(String[] args) {
        //   ✅ Left Triangle Star Pattern

        //*****
        //****
        //***
        //**
        //*


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}
