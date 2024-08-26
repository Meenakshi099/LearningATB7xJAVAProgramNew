package ex_17082024_wrapperClass;

public class exception_ex3 {
    public static void main(String[] args) {
        final double pi =3.14;
        int x = 0;
        try{
            int y = 10/x;
        }catch (Exception e)
        {
            System.out.println("div by zero");
        }
        finally{
            System.out.println("i will be executed always");
        }
    }
}
