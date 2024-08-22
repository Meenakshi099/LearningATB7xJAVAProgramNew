package ex_28082024;

import ex_28082024.july.animal;

public class labAnimal {
    public static void main(String[] args) {
        animal animalrRef = null;
        animal animalrRef2 = new animal();
        animal animalrRef3 = new animal();
        animal animalrRef4 = animalrRef2;
        System.out.println(animalrRef3.name);
    }
}
