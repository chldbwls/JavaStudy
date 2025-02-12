

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int[] arr=new int[a];
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<a;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            int mindiff=Integer.MAX_VALUE;
            int count=0;
            
            int start =0;
            int end =a-1;
            while(start<end){
                int sum=arr[start]+arr[end];
                int dif = Math.abs(b-sum);
                if(dif<mindiff){
                    mindiff=dif;
                    count=1;
                }else if(dif==mindiff){
                    count++;
                }

                if(sum<b){
                    start++;
                }else{
                    end--;
                }
            }

            bw.write(count+"\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}

