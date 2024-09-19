
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        int[][] arr = new int[size + 1][size + 1];
        int[][] prefixSum = new int[size + 1][size + 1];

        // 배열 입력
        for (int i = 1; i <= size; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 1; j <= size; j++) {
                arr[i][j] = Integer.parseInt(st2.nextToken());
                // 누적합 계산
                prefixSum[i][j] = arr[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        }

        // 쿼리 처리
        for (int i = 0; i < count; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st3.nextToken());
            int y1 = Integer.parseInt(st3.nextToken());
            int x2 = Integer.parseInt(st3.nextToken());
            int y2 = Integer.parseInt(st3.nextToken());

            // 누적합을 이용해 영역의 합 계산
            int sum = prefixSum[x2][y2] 
                    - prefixSum[x1 - 1][y2] 
                    - prefixSum[x2][y1 - 1] 
                    + prefixSum[x1 - 1][y1 - 1];

            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
