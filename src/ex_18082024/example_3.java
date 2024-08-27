package ex_18082024;

public class example_3 {
    public static void main(String[] args) {
        try {
            String s1  = "meenu";
            if (s1 == null){
                throw new Exception("Add a proper String or not null String");
            }
            s1.trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //

    }
}
