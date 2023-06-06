package algo.dataStructure;

import java.util.Scanner;

public class P10986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N];
        long[] C = new long[M];

        long answer = 0;

        // 첫번쨰 인자는 더할 필요 없으니 입력만
        S[0] = sc.nextInt();
        // 구간 합 배열
        for(int i=1; i<N; i++) {
            S[i] = S[i-1] + sc.nextInt();
        }

        for(int i=0; i<N; i++) {    // 합배열의 모든 값에 %연산 수행
            int remainder = (int)(S[i] % M);

            if(remainder == 0) answer++;

            C[remainder]++;
        }
        for(int i=0; i<M; i++) {
            if(C[i] > 1) {
                //나머지가 같은 인덱스 중 2개를 뽑는 경우의 수를 더하기
                answer = answer + (C[i] * (C[i] -1) / 2);
            }
        }

        System.out.println(answer);
    }
}
