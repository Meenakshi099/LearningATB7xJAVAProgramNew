package ex_17082024_wrapperClass;

public class exception_ex4 {
    public static void main(String[] args) {


    int b = 0; // ArithmeticException
        try {
        String ip = args[0]; // ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); // NumberFormatException
        b = 1000/a;
    } catch (ArithmeticException| NumberFormatException | ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
    }
        System.out.println(b);
        System.out.println("End of the program");
}
}
