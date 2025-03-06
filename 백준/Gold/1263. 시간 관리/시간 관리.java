

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));

        int start = arr[0][1];

        for (int i = 0; i < N; i++) {
            start = Math.min(start, arr[i][1]);
            start -= arr[i][0];

            if (start < 0) {
                bw.write(-1+"\n");
                bw.flush();
                bw.close();
                br.close();
                return;
            }
        }

        bw.write(start + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
