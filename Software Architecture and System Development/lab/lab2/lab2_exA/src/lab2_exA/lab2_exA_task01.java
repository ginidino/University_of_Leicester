package lab2_exA;

import java.text.SimpleDateFormat;
import java.util.Date;

public class lab2_exA_task01 {
    public static void main(String[] args) {
        String YOUR_NAME = "injae Lee";

        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        String current = null;

        try {
            current = date.format(new Date());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(YOUR_NAME + ": " + current);
    }
}
