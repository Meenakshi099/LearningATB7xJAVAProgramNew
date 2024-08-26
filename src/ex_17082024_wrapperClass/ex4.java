package ex_17082024_wrapperClass;

public class ex4 {
    public static void main(String[] args) {
        Double d = 3.14; // HEAP
        double val = d.doubleValue(); // CM
        System.out.println(d);
        System.out.println(val);

        String s1 = "pramod"; // SCP
        String s2 = new String("pramod"); // HEAP

    }
}
