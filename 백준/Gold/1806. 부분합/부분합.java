import java.io.*;
import java.util.*;

public class Main {
    static char[][] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 0;
        int sum =0;
        int len = Integer.MAX_VALUE;
        while(right<n){
            sum+=arr[right];
            while (sum >= s) {
                len = Math.min(len, right-left+1);
                sum -= arr[left++];
            }
            
            right++;
        }

        if (len == Integer.MAX_VALUE) {
            bw.write(0+"\n");
        } else {
            bw.write(len + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}