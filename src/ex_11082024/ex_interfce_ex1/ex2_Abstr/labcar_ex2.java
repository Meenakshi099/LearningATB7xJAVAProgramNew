package ex_11082024.ex_interfce_ex1.ex2_Abstr;

public class labcar_ex2 {
    public static void main(String[] args) {

        Tesla t = new Tesla();
        t.drive();
        System.out.println(" --- --- ");
        Car c = new Car();
        c.openCar();
        c.speed();
        c.start();
        c.stop();
        c.partGearBox();

        System.out.println(" --- --- ");
        System.out.println(" --- --- ");
        wagnor wagonR = new wagnor();
        wagonR.drive();
    }
}
