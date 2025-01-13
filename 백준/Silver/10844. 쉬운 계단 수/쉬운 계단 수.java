

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        final int MOD = 1_000_000_000;
        int[][] dp = new int[2][10];

        for (int i = 1; i <= 9; i++) {
            dp[0][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    dp[1][j] = dp[0][1];
                } else if (j == 9) {
                    dp[1][j] = dp[0][8];
                } else {
                    dp[1][j] = (dp[0][j - 1] + dp[0][j + 1]) % MOD;
                }
            }
            for (int j = 0; j <= 9; j++) {
                dp[0][j] = dp[1][j];
            }
        }

        int total = 0;
        for (int i = 0; i <= 9; i++) {
            total = (total + dp[0][i]) % MOD;
        }

        bw.write(total + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
