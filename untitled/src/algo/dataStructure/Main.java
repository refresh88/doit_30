package algo.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * InputStreamReader(System.in))는 표준 입력(System.in)을 InputStreamReader로 변환한 후에
         * BufferedReader로 감싸서 사용한다.
         * 이렇게 함으로써 입력한 문자열을 버퍼링하여 한 줄씩 읽어올 수 있게 된다.
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(N + M);
    }
}
