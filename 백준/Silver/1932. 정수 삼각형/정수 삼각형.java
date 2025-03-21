

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int[][] dp = new int[n][n];


        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<=i;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0]=arr[0][0];

        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    dp[i][j]=dp[i-1][j]+arr[i][j];
                }else if(j==i){
                    dp[i][j]=dp[i-1][j-1]+arr[i][j];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j-1]+arr[i][j],dp[i-1][j]+arr[i][j]);
                }
            }
        }

        int max = dp[n-1][0];
        for(int i=1;i<n;i++){
            if(dp[n-1][i]>max){
                max = dp[n-1][i];
            }
        }

        bw.write(max+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
