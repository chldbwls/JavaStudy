

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sumList.add(arr[i] + arr[j]);
            }
        }

        Collections.sort(sumList);

        int max = Integer.MIN_VALUE;

        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int target = arr[i] - arr[j];
                if (Collections.binarySearch(sumList, target) >= 0) {
                    max = Math.max(max, arr[i]);
                }
            }
        }

        bw.write(max + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
