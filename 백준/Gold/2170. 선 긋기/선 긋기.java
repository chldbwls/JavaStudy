

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] line = new int[N][2];
        int sum = 0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            line[i][0]=Integer.parseInt(st.nextToken());
            line[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(line,(a,b)->Integer.compare(a[0], b[0]));
        int start = line[0][0];
        int end = line[0][1];
        for(int i=1;i<N;i++){
            if(line[i][0]>=start&&line[i][0]<=end){
                if(line[i][1]>end){
                    end=line[i][1];
                }
            }else{
                sum+=end-start;
                start=line[i][0];
                end=line[i][1];
            }
        }
        sum+=end-start;
        bw.write(sum+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
