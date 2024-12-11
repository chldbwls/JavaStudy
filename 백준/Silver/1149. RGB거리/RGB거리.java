
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        int[][] dp = new int[n][3];
        
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<3;i++){
            dp[0][i]=arr[0][i];
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    dp[i][j]=Math.min(dp[i-1][1],dp[i-1][2])+arr[i][j];
                }else if(j==1){
                    dp[i][j]=Math.min(dp[i-1][0],dp[i-1][2])+arr[i][j];
                }else{
                    dp[i][j]=Math.min(dp[i-1][1],dp[i-1][0])+arr[i][j];
                }
            }
        }

        int min = dp[n-1][0];
        for(int i=1;i<3;i++){
            if(dp[n-1][i]<min){
                min = dp[n-1][i];
            }
        }


        bw.write(min+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
