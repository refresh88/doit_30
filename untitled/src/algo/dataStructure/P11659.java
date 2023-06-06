package algo.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());   // 숫자개수
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 퀴즈 개수
        long[] S = new long[suNo + 1];  // S[0]은 0으로 둘거기 때문에 인덱스를 숫자개수 + 1

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i<=suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken()); // 구간합 미리 구하기.
        }

        for (int q = 0; q <quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
