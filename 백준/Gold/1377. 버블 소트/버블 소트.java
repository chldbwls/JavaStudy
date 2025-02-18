


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr= new int[N][2]; 

        for(int i=0;i<N;i++){
            arr[i][0]=Integer.parseInt(br.readLine());
            arr[i][1]=i;    
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            int a = arr[i][1]-i;
            if(max<a){
                max=a;
            }
        }

        bw.write((max+1)+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}



