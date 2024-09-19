import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        int max=0;
        int count=0;
        int[] sum_arr = new int[size];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<size;i++){
            sum_arr[i]=Integer.parseInt(st2.nextToken());
        }
        int start=0;
        int end=sum-1;
        while(end!=size){
            for(int i=start;i<=end;i++){
                count=count+sum_arr[i];
            }
            if(count>max||start==0){
                max=count;
            }
            count=0;
            start++;
            end++;
        }

        bw.write(max+"\n");


        bw.flush();
        bw.close();
        br.close();
    }
}