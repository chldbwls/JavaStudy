

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int dis[] = new int[N-1];
        int oil_sta[]= new int[N];


        //주유소와 각 사이의 길이를 배열에 저장 
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N-1;i++){
            dis[i]=Integer.parseInt(st.nextToken());
        }
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            oil_sta[i]=Integer.parseInt(st.nextToken());
        }

        long total = 0;
        long min = oil_sta[0];
        for(int i=0;i<N-1;i++){
            total+=dis[i]*min;
            if(min>oil_sta[i+1]){
                min=oil_sta[i+1];
            }
        }


        bw.write(total+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
