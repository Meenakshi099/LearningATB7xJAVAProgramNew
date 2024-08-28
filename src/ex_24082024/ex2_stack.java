package ex_24082024;

import java.util.Stack;

public class ex2_stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("Pramod");
        s.push("Meenu");
        s.push("HAri");
        s.push("virat");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search("Virat"));
    }
}
