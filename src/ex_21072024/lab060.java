package ex_21072024;

public class lab060 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {    //break
                 continue;
            }
            System.out.println("hello");
        }
    }

}
