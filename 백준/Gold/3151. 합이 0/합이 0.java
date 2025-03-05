import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < N - 2; i++) {
            if (arr[i] > 0) break;

            int start = i + 1;
            int end = N - 1;

            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];

                if (sum == 0) {
                    if (arr[start] == arr[end]) {  
                        int n = end - start + 1;
                        count += (n * (n - 1)) / 2;
                        break;
                    }

                    int startCount = 1;
                    int endCount = 1;

                    while (start + 1 < end && arr[start] == arr[start + 1]) {
                        start++;
                        startCount++;
                    }

                    while (start < end - 1 && arr[end] == arr[end - 1]) {
                        end--;
                        endCount++;
                    }

                    count += startCount * endCount;
                    start++;
                    end--;
                } 
                else if (sum > 0) {
                    end--;
                } 
                else {
                    start++;
                }
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
