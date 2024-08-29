package ex_24082024;

import java.util.*;

public class example_4 {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add("Meenu");
        s.add("Ramya");
        s.add("sara");
        s.add("hari");
        s.add("prdm");
        System.out.println(s);


        Set s1 = new LinkedHashSet();
        s1.add("Meenu");
        s1.add("Ramya");
        s1.add("sara");
        s1.add("hari");
        s1.add("prdm");
        System.out.println(s1);
        System.out.println(s1.isEmpty());
        System.out.println(s1.contains("Apple"));
        System.out.println(s1.size());



        Set s2 = new TreeSet();
        s2.add("Meenu");
        s2.add("Ramya");
        s2.add("sara");
        s2.add("hari");
        s2.add("prdm");
        System.out.println(s2);

        for (Object T1 :s)
        {
            System.out.println(T1);
        }

        Iterator T2 = s1.iterator();
        while(T2.hasNext()){
            System.out.println(T2.next());
        }

    }
}
