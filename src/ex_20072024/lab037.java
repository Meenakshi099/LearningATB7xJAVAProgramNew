package ex_20072024;

import java.util.Scanner;

public class lab037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1- A");
        int side1 = sc.nextInt();


        System.out.println("Enter the num2- B");
        int side2 = sc.nextInt();


        System.out.println("Enter the num3- C");
        int side3 = sc.nextInt();

       if((side1 == side2) && (side2 == side3) && (side3 == side1))
        {
            System.out.println("Triangle is Equilateral");
        }
       else if((side1 == side2)|| (side2 == side3) || (side3 == side1))
       {
           System.out.println("Triangle is isosceles");
       }
       else{
           System.out.println("Triangle is scalene");
       }



    }
}
