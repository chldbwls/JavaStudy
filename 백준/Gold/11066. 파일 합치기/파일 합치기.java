

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int total = Integer.parseInt(br.readLine());
            int[] file = new int[total];
            int[] sum = new int[total+1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<total;i++){
                int a = Integer.parseInt(st.nextToken());
                file[i]=a;
                sum[i+1]=sum[i]+a;
            }
            int[][] dp = new int[total][total];
            for(int len=2;len<=total;len++){
                for(int i=0;i<=total-len;i++){
                    int j = i+len-1;
                    dp[i][j]=Integer.MAX_VALUE;
                    for(int k=i;k<j;k++){
                        int cost = dp[i][k]+dp[k+1][j]+(sum[j+1]-sum[i]);
                        dp[i][j]=Math.min(dp[i][j],cost);
                    }
                }
            }
            bw.write(dp[0][total-1]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
