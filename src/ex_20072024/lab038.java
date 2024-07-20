package ex_20072024;

public class lab038 {
    public static void main(String[] args) {
        int num;
        for(num =1;num<=100;num++)
        {
            if((num%3==0) && (num%5==0))
            {
                System.out.println("Fizzbuzz");
            }
            else if(num%3==0)
            {
                System.out.println("Fizz");
            }
            else if(num%5==0)

            {
                System.out.println("Buzz");
            }

        }
    }
}
