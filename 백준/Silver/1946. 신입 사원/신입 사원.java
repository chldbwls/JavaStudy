

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            int[][] arr= new int[N][2];
            for(int j=0;j<N;j++){
                StringTokenizer st =new StringTokenizer(br.readLine());
                arr[j][0]=Integer.parseInt(st.nextToken());
                arr[j][1]=Integer.parseInt(st.nextToken());
            } 
            Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
            int min = Integer.MAX_VALUE;
            int count=0;
            for(int j=0;j<N;j++){
                if(arr[j][1]<min){
                    count++;
                    min=arr[j][1];
                }
            }
            bw.write(count+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}