package lab2_exA;

import java.util.ArrayList;

public class lab2_exA_task05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("orange");
        list.add("banana");
        list.add("coconut");

        for (String fruit : list) {
            if (fruit.contains("n")) {
                System.out.println("The fruit " + fruit + " contains the letter n");
            } else {
                System.out.println("The fruit " + fruit + " does not contain the letter n");
            }
        }
    }
}
