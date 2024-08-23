package ex_04082024.aug04class;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankAccountClass {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Name of the Bal!");
        int bal = sc.nextInt();
        System.out.println("Enter your Name of the Bank cODE!");

        String bCode = sc.next();

        BankAccount baicici = new BankAccount(bName, bal, bCode);
        BankAccount baHdfc = new BankAccount("HDFC",9800000);

        System.out.println(baHdfc.bankName);
        System.out.println(baicici.bankCode);

        System.out.println(baHdfc.balance);

        baicici.printDetails();

        sc.close();

    }
}
