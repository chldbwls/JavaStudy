

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
        }

        int mini = Integer.parseInt(br.readLine());

        int[][] dp = new int[4][N];

        for (int i = 1; i <= 3; i++) {
            for (int j = i * mini - 1; j < N; j++) {
                int sum = arr[j] - (j - mini >= 0 ? arr[j - mini] : 0);

                if (j - mini >= 0) {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j - mini] + sum);
                } else {
                    dp[i][j] = sum;
                }
            }
        }

        bw.write(dp[3][N - 1] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
