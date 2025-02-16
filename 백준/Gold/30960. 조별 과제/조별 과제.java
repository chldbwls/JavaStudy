

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());    
        int[] arr =new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int[] left = new int[N];
        for(int i=1;i<N;i+=2){
            left[i]=(arr[i]-arr[i-1]);
            if(i-2>=0){
                left[i]+=left[i-2];
            }
        }

        int[] right = new int[N];
        for(int i=N-2;i>0;i-=2){
            right[i]=arr[i+1]-arr[i];
            if(i+2<N){
                right[i]+=right[i+2];
            }
        }

        int result = Integer.MAX_VALUE;
        for(int i=0;i<N-2;i+=2){
            int a = arr[i+2]-arr[i];
            if(i-1>=0){
                a+=left[i-1];
            }
            if(i+3<N){
                a+=right[i+3];
            }
            result=Math.min(a, result);
        }

        bw.write(result+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}

