package algo.dataStructure;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();

        String addNeedNumber = scan.next();
        char[] dividedNumber = addNeedNumber.toCharArray();
        int sum = 0;
        for(int i=0; i < dividedNumber.length; i++) {
            sum += dividedNumber[i] - '0';
        }
        System.out.println(sum);

    }
}
