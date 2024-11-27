

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        int[] dp1 = new int[size]; // dp[i]는 i까지의 가장 긴 증가하는 부분 수열의 길이
        int[] dp2 = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.fill(dp1, 1); // 모든 dp값을 1로 초기화 (최소한 자기 자신을 포함하므로 길이는 1)

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp1[i] = Math.max(dp1[i], dp1[j] + 1); // 더 긴 수열이 있다면 갱신
                }
            }
        }

        for (int i = size-1; i >=0; i--) {
            for (int j = size-1; j >i; j--) {
                if (arr[i] > arr[j]) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + 1); // 더 긴 수열이 있다면 갱신
                }
            }
        }

        int max = 0;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, dp1[i]+dp2[i]); // 가장 긴 길이를 찾음
        }

        bw.write(max+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}

