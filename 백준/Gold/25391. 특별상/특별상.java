import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[1],a[1]));

        long max = 0;
        for (int i = 0; i < K; i++) {
            max += arr[i][0];
        }

        int[][] arr2 = new int[N - K][2];
        for (int i = K; i < N; i++) {
            arr2[i - K][0] = arr[i][0];
            arr2[i - K][1] = arr[i][1];
        }

        Arrays.sort(arr2, (a, b) -> Integer.compare(b[0],a[0]));

        for (int i = 0; i < M; i++) {
            max += arr2[i][0];
        }

        bw.write(max + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
