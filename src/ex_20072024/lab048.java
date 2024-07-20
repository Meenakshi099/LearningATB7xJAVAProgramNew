package ex_20072024;

public class lab048 {
    public static void main(String[] args) {
        // JDK > 13

        int itemcode = 002;
        switch (itemcode) {
            case 001, 002, 003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004, 005, 007:
                System.out.println("It is Mechanical Gadget!");
                break;
            default:
                System.out.println("None");

        }
    }
}
