

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int result = 0;
        int index = 0;

        for (int[] p : arr) {
            int start = p[0];
            int end = p[1];

            if (end <= index){
                continue;
            }  

            if (index < start){
                index = start;
            }  

            int count = (end - index + L - 1) / L;  
            result += count;
            index += count * L;  
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
