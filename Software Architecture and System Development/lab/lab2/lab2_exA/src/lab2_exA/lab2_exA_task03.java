package lab2_exA;

import java.util.ArrayList;

public class lab2_exA_task03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        float average = (float) sum / list.size();
        System.out.println("Average: " + average);
    }
}
