package ex_04082024.aug04class;

public class ATBPerson {
    String name;
    Long phone;

    ATBPerson()
    {
        System.out.println("obj is created");
    }

    ATBPerson(String name)
    {
        this.name=name;
    }
    ATBPerson(String name ,Long phone)
    {
        this.name=name;
        this.phone=phone;
    }
}
