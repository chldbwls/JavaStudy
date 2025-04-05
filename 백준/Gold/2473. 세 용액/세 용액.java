

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        long min=Long.MAX_VALUE;
        int x=0,y=0,z=0;
        for(int i=0;i<N-2;i++){
            int start =i+1;
            int end = N-1;
            while(start<end){
                long sum=(long)arr[i]+arr[start]+arr[end];
                if(Math.abs(sum)<min){
                    min=Math.abs(sum);
                    x=arr[i];
                    y=arr[start];
                    z=arr[end];
                }
                if(sum<0){
                    start++;
                }else{
                    end--;
                }
            }
        }

        bw.write(x+" "+y+" "+z+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
