package lab2_exA;

import java.util.ArrayList;

public class lab2_exA_task02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("orange");
        list.add("banana");
        list.add("coconut");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
