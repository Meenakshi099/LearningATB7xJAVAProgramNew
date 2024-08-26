package ex_11082024.ex_interfce_ex1;

public class TestInterfce {
    public class Lab192 {
        public static void main(String[] args) {
            Car c = new Car();
            c.start();
            c.m1();
        }
    }

    interface Eng {
        void start();

        default void m1() {
            System.out.println("Old M1"); // default and static are already implemented and it will ne
        }                                 // used in interface

        default void suite() {
            System.out.println("wear suite");
        }
    }

    interface GearBox extends Eng {
        void gear();

    }

    interface Keys extends GearBox {
        void openCar();
    }


    static class Car implements Keys {

        @Override
        public void start() {
            System.out.println("Starting");
        }

        @Override
        public void gear() {

        }

        @Override
        public void openCar() {

        }
    }
}
