

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        
        int[] weight = new int[n+1];
        int[] value = new int[n+1];
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            weight[i]=Integer.parseInt(st.nextToken());
            value[i]= Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[W+1]; 
        for(int i=1;i<=n;i++){
            for(int w=W;w>=weight[i];w--){
                dp[w] = Math.max(dp[w],dp[w-weight[i]]+value[i]);
            }
        }

        bw.write(dp[W]+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
