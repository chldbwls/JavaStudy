import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        // 차이 계산
        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i] = b - a;
        }

        // 배열 정렬
        Arrays.sort(arr);

        // 중앙값 및 범위 계산
        int medianIndex = size / 2;

        // 중앙값이 홀수일 때
        int minSum;
        if (size % 2 == 1) {
            minSum = arr[medianIndex];
            bw.write("1\n");
        } else {
            // 중앙값이 두 개일 때
            minSum = arr[medianIndex - 1]; // 첫 번째 중앙값
            int count = arr[medianIndex] - arr[medianIndex - 1] + 1; // 두 중앙값의 차이 + 1
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
