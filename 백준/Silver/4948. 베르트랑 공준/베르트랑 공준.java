

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        int start = Integer.parseInt(br.readLine());
        while(start!=0){
            int end = start*2;
            int count = test(start,end);
            bw.write(count+"\n");
            start=Integer.parseInt(br.readLine());
        }


        bw.flush();
        bw.close();
        br.close();
    }
    public static int test(int start, int end){
        boolean arr[] = new boolean[end+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=end;i++){
            if(arr[i]){
                for(int j=i*i;j<=end;j+=i){
                    arr[j]=false;
                }
            }
        }
        int count =0;
        for(int i=start+1;i<=end;i++){
            if(arr[i]){
                count++;
            }
        }
        return count;
    }
}
