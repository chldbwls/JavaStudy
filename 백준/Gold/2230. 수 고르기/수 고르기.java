

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int left = 0;
        int right = 1;
        int min = Integer.MAX_VALUE;

        while (right < N) {
            int a = arr[right] - arr[left];

            if (a >= M) { 
                min = Math.min(min, a); 
                left++;
            } else {
                right++;
            }

            if (left == right) right++;
        }

        bw.write(min + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
