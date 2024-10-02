import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        int[] dp = new int[size]; // dp[i]는 i까지의 가장 긴 증가하는 부분 수열의 길이

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.fill(dp, 1); // 모든 dp값을 1로 초기화 (최소한 자기 자신을 포함하므로 길이는 1)

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1); // 더 긴 수열이 있다면 갱신
                }
            }
        }

        int max = 0;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, dp[i]); // 가장 긴 길이를 찾음
        }

        System.out.println(max);
    }
}
