package algo.ifelif;

import java.util.Scanner;

public class P2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int cookTime = Integer.parseInt(sc.next());
        int oT = min + cookTime;
        int overHour = 0;

        if(oT < 60) {
            min = oT;
        } else if (oT%60 == 0) {
            overHour = oT/60;
            hour += overHour;
            min = 0;
        } else {
            overHour = oT/60;
            hour += overHour;
            min = oT%60;
        }

        if(hour == 24) {
            hour = 0;
        } else if(hour > 24) {
            hour = hour%24;
        }

        System.out.println(hour + " " + min);

    }
}
