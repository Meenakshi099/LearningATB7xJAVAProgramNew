package ex_04082024.aug04class;

public class labFaSon {
    public static void main(String[] args) {
        son s = new son();
        s.bhk3();
        s.bhk2();

        Father f = new Father();
        f.bhk2();
      //  f.bhk3(); not applicable
                   // becox son can only extend from father and not father can extend from son


    }
}
