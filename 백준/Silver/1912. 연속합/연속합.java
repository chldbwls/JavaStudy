import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[size];
        dp[0] = arr[0];
        int max = arr[0];
        
        for (int i = 1; i < size; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            max = Math.max(max, dp[i]);
        }

        bw.write(max+"\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}