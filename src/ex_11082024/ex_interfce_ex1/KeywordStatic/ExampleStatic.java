package ex_11082024.ex_interfce_ex1.KeywordStatic;

public class ExampleStatic {
    // Static
    // block
    // Data member
    // Function
    // Class

    public static void main(String[] args) {
        ATB a1 = new ATB("amit");
    }
}


class ATB{

    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a webite or anything before starting the
        // web automation or api automation
        //
        System.out.println("Reading from CSV file");
    }

    static {
        System.out.println("Load the class?, I will execute");
    }

         // static will be loaded in the class loader no need to call separately by creating object!

    private String name;
    private String phone;
    static String courseName = "ATB";   // common - static

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }

    static void doAssignment(){
        System.out.println("Do Assignment");
    }

    static class A{

    }
}
