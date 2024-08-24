package Encapsulation;

public class ICICIBank {
    private String name;
    private long bal;

    public ICICIBank(String name , long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAdmin) {
        if(isAdmin){
            System.out.println("Name can be changed");
            this.name = name;
        }
        else{
            System.out.println("Name cannot be changed");
        }

    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, Boolean isAdmin) {
        if(isAdmin){
            System.out.println("bal can be changed");
            this.bal = bal;
        }
        else{
            System.out.println("bal cannot be changed");
        }
    }
}
