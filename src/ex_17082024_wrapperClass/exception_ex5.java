package ex_17082024_wrapperClass;

public class exception_ex5 {
    public static void main(String[] args) {


        int x = 0;
        try{
        int y = 10 / x;
            System.out.println(y);
           }catch (Exception e)
        {
            System.out.println( x + "div by zero");
        }

    }
}
