package ex_28082024;

import ex_28082024.july.bank;

public class labbank {
    public static void main(String[] args) {
        bank bank1 = new bank();
        bank bank2 = new bank();

        bank1.name = "SBI";
        bank2.name = "ICICI";

        System.out.println(bank1.name);
        System.out.println(bank2.name);
        System.out.println(bank2.balance);
        bank1.withDraw();

        bank2.balance = 100;
        System.out.println(bank2.balance);
        System.out.println(bank1.balance);
    }
}
