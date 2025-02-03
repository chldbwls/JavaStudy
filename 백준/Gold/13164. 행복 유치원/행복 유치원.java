

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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr= new int[N];
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int[] dif = new int[N-1];
        for(int i=0;i<N-1;i++){
            dif[i]=arr[i+1]-arr[i];
        }

        Arrays.sort(dif);
        int sum = 0;
        for(int i=0;i<N-K;i++){
            sum+=dif[i];
        }
        bw.write(sum+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
