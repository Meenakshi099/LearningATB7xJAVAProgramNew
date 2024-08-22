package ex_28082024;

public class lab089
{
    public static void main(String[] args) {
        //  Class - Attribute / properties - data Types - primitve or non primitive.
        // Class - Behaviour /Methods - functions -

        // object - real entity - class -
        // ClassName classRef = new ClassName();

        // new ClassName(); - Object
        // classRef - Class Ref
        // ClassName = Class Name which blueprint you are using




        BuidingBp.BuildingBP dlf = new BuidingBp.BuildingBP();
        dlf.name = "DLF Pvt Builder";
        dlf.noOfRooms = 100;

        dlf.useLift();


        BuidingBp.BuildingBP prestige = new BuidingBp.BuildingBP();
        prestige.name = "Prestige Pvt Builder";
        prestige.noOfRooms = 100;

        prestige.useLift();

    }
}


