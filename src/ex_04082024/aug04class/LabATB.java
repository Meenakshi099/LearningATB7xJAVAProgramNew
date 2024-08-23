package ex_04082024.aug04class;

public class LabATB {
    public static void main(String[] args) {
        ATBPerson p1 = new ATBPerson();
        ATBPerson p2 = new ATBPerson("Meenu", 9080087554L);
        ATBPerson P3 = new ATBPerson("HariHaran");
        ATBPerson p4 = new ATBPerson("Meenakshi");

        System.out.println(p1.name);
        System.out.println(p2.phone);
        System.out.println(P3.phone);
        System.out.println(p2.name);
        System.out.println(P3.name);
        System.out.println(p4.name);

    }
}
