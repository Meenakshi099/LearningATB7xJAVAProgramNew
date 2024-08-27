package ex_18082024.Collectionframework;

import java.util.ArrayList;
import java.util.List;

public class collframe_ex3 {
    public static void main(String[] args) {
        int [] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        for (int i = 0; i < a.length ; i++) {
            if( a[i] == 4){
                System.out.println("Found 4");
            }
        }
        List arr1 = new ArrayList();
        ArrayList arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr1.add(1));
        System.out.println(arr1);
        System.out.println(arr.equals(5));
        System.out.println(arr.contains(4));

    }
}
