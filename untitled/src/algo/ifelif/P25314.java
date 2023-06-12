package algo.ifelif;

import java.util.Scanner;

public class P25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int four = sc.nextInt();

        String result = "";

        for(int i=0; i<four/4; i++) {
            result = result + "long ";
        }

        result = result + "int";
        System.out.println(result);
    }
}
