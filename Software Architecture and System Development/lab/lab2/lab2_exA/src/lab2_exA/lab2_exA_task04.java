package lab2_exA;

import java.util.ArrayList;

public class lab2_exA_task04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("orange");
        list.add("banana");
        list.add("coconut");

        if (list.contains("banana")) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
