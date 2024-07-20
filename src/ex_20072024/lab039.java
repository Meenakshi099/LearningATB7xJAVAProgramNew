package ex_20072024;

public class lab039 {
    public static void main(String[] args) {
               int year = 2021;
               if((year%100==0) || (year%4==0))
                   System.out.println("Leap year");
               else{
                   System.out.println("Non leap year");
               }
    }
}
