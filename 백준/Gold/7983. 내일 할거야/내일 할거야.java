

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i=0;i<N;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,(a,b)->Integer.compare(b[1], a[1]));   //마감 날짜 순으로 내림차순 정렬 
        int start = arr[0][1]-arr[0][0]+1;
        for(int i=1;i<N;i++){   
            if(start-1>arr[i][1]){
                start=arr[i][1]-arr[i][0]+1;
            }else{
                start=start-1-arr[i][0]+1;
            }
        }

        bw.write((start-1)+"\n");


        bw.flush();
        bw.close();
        br.close();
    }
}