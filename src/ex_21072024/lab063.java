package ex_21072024;

import java.util.Scanner;

public class lab063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num,will print Factorial");
        int n = sc.nextInt();

        int fact = 1;
        // 5 -> i = 1 to 5 -    1*2 = fact,
        for (int i = 1; i <=n ; i++) {
            fact = fact*i;
        }
        System.out.println(fact);

        sc.close();
    }
}
