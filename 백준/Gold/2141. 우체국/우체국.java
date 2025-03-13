

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        long totalWeight = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            totalWeight += arr[i][1];
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        long weightSum = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            weightSum += arr[i][1];

            if (weightSum >= (totalWeight + 1) / 2) {
                result = arr[i][0];
                break;
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
