package ex_11082024.ex_interfce_ex1.ex2_Abstr;

public class Tesla extends Engine{
    void drive(){
        openCar();
        start();
        partGearBox();
        stop();
        speed();
    }


    @Override
    void start() {
        System.out.println("starting the tesla");

    }

    @Override
    void stop() {
        System.out.println("starting the tesla car");

    }

    @Override
    void speed() {
        System.out.println("100km/hr");

    }

    @Override
    void partGearBox() {
        System.out.println("Electric");

    }

    @Override
    void openCar() {
        System.out.println("Opening the tesla car");

    }
}
