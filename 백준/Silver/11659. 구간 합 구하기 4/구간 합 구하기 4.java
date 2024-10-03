import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        int[] arr = new int[size];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<size;i++){
            if(i==0){
                arr[0]=Integer.parseInt(st2.nextToken());
            }else{
                arr[i]=arr[i-1]+Integer.parseInt(st2.nextToken());
            }
        }

        for(int i=0;i<num;i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st3.nextToken());
            int end = Integer.parseInt(st3.nextToken());
            if(start==1){
                bw.write(arr[end-1]+"\n");
            }else{
                bw.write(arr[end-1]-arr[start-2]+"\n");
            }
        }

        
        bw.flush();
        bw.close();
        br.close();
    }
}