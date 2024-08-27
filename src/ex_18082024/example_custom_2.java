package ex_18082024;

import java.util.Scanner;

public class example_custom_2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try{
        if(x==0){
            throw new ArithmeticException("enter non zero number");
        }
        int a = 10/x;
            System.out.println(a);

        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
}
