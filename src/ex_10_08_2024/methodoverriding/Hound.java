package ex_10_08_2024.methodoverriding;

public class Hound extends Dog{
    @Override
    void bark(){
        System.out.println("I am Hound, i will Bark!!");
    }

    void bike(){
        System.out.println("Biked");
    }

}
