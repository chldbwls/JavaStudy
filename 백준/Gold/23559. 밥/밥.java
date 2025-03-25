

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st =new StringTokenizer(br.readLine());
        int day=Integer.parseInt(st.nextToken());
        int money=Integer.parseInt(st.nextToken());

        int[][] arr = new int[day][3];
        for(int i=0;i<day;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            arr[i][2]=arr[i][0]-arr[i][1];
        }

        Arrays.sort(arr,(a,b)->Integer.compare(b[2], a[2]));
        int total=0;
        int A=money/5000;
        int B=(money%5000)/1000;
        while(A+B<day){
            A--;
            B+=5;
        }
        for(int i=0;i<day;i++){
            if(A<=0||arr[i][2]<=0){
                total+=arr[i][1];
            }else{
                total+=arr[i][0];
                A--;
            }
        }

        bw.write(total+"\n");



        bw.flush();
        bw.close();
        br.close();
    }
}