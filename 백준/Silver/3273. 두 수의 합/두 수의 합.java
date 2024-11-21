import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int[] arr= new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());

        int count =0;
        Arrays.sort(arr);
        
        int start = 0;
        int end = a-1;
        while(start<end){
            int sum = arr[start]+arr[end];
            if(sum==x){
                count++;
                start++;
                end--;
            }else if(sum<x){
                start++;
            }else{
                end--;
            }
        }
        
        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}