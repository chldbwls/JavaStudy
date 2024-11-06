import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < num && count > 0; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < num && j <= i + count; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                int temp = arr[maxIdx];
                for (int j = maxIdx; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i] = temp;
                count -= (maxIdx - i);
            }
        }

        for (int i = 0; i < num; i++) {
            bw.write(arr[i] + " ");
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
