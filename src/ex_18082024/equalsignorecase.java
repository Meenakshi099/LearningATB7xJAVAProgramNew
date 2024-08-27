package ex_18082024;

public class equalsignorecase {
    public static void main(String[] args) {


        String name = "Pramod"; // pramod
        String name2 = "pramod"; // pramod
        String name3 ="Meenu";
        if (name.equalsIgnoreCase(name2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not EQUAL");
        }

    }
}
