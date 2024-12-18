

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        for(int i=0;i<n;i++){
            coin[i]=Integer.parseInt(br.readLine());
        }

        int[] dp = new int[k+1];
        dp[0]=1;
        for(int c : coin){
            for(int i=c;i<=k;i++){
                dp[i]+=dp[i-c];
            }
        }

        bw.write(dp[k]+"\n");


        bw.flush();
        bw.close();
        br.close();
    }
}
