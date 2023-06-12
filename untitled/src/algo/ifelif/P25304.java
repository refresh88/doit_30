package algo.ifelif;

import java.util.Scanner;

public class P25304 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSum = sc.nextInt();
        int itemCnt = sc.nextInt();
        int itemPriceSum = 0;
        for(int i=0; i<itemCnt; i++) {
            int itemPrice = sc.nextInt();
            int cnt = sc.nextInt();
            itemPriceSum += itemPrice * cnt;
        }

        if(totalSum == itemPriceSum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
