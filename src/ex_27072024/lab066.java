package ex_27072024;

import java.util.Scanner;

public class lab066 {
    public static void main(String[] args) {
        //   ✅ Right Triangle Star Pattern

        //   *
        //   **
        //  ***
        //  ****
        //  *****
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}
