package ex_17082024_wrapperClass;

public class example2 {
    public static void main(String[] args) {
        //primitive to wrapper class - //autoboxing
        int a = 10;
        Integer b = a;// int to Integer - autoboxing
        System.out.println(b);
        System.out.println(a);


        //wrapper class to primitive // unboxing
        Integer d = 20;
        int f = d;
        System.out.println(d.floatValue());
        System.out.println(f);  // Integer to Int - unboxing
    }
}
