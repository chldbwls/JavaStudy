
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        arr[0]=Integer.parseInt(br.readLine());
        int sum = arr[0];
        for(int i=1;i<N;i++){
            int a = Integer.parseInt(br.readLine());
            arr[i]=arr[i-1]+a;
            sum+=a;
        }
        int start = 0;
        int end=1;
        int max=Integer.MIN_VALUE;
        while(start<N-1){
            int result=arr[end]-arr[start];
            max=Math.max(max,Math.min(result,sum-result));
            if(end==N-1){
                start++;
                end=start+1;
            }else{
                end++;
            }
        }
        bw.write(max+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
