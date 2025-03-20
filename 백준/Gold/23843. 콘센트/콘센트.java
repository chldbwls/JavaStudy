

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Integer[] arr= new Integer[N];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,Collections.reverseOrder());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<M;i++){
            pq.add(0);
        }

        for(int t:arr){
            int a = pq.poll();
            pq.add(a+t);
        }

        int result=0;
        while(!pq.isEmpty()){
            result=pq.poll();
        }
        bw.write(result+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}