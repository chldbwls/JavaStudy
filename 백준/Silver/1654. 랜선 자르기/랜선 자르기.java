import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr= new int[a];
        long start = 1;
        long end = 0;
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]>end){
                end = arr[i];
            }
        }
        long result = 0;
        while(start<=end){
            long mid = (start+end)/2;
            int total = 0;
            for(int i=0;i<a;i++){
                total+=arr[i]/mid;
            }
            if(total>=N){
                result = mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        bw.write(result+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}