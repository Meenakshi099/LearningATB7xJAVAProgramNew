package ex_10_08_2024.methodoverriding;

public class DogHoundcls {
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bike();
        h1.bark();

        Dog d1 = new Dog();
        d1.bark();

        Dog dog_ref = new Hound();
        dog_ref.bark();
        //Hound h2 = new Dog();

    }
}
