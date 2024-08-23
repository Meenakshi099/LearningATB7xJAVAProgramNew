package ex_04082024.aug04class.multilevelInheritenance;

public class LabMultiInherit {
    public static void main(String[] args) {
        child c1 = new child();
        c1.extra();
        c1.home();

        father f1 = new father();
        f1.gf();

        Grandfather gf = new Grandfather();
        gf.gf();


    }

}
