package ex2_Abstr;

public class Car extends Engine {

    @Override
        void start () {
            System.out.println("start the car");
        }

        @Override
        void stop () {
            System.out.println("stop the car");

        }

        @Override
        void speed () {
            System.out.println("The speed will increase");
        }

        @Override
        void partGearBox () {
            System.out.println("Gearbox can change");

        }

        @Override
        void openCar () {
            System.out.println("Open the car");
        }
    }

