

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][2];
        for(int i=0;i<N;i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(a,b)-> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] a : arr){
            int start = a[0];
            int end = a[1];

            if(!pq.isEmpty()&&pq.peek()<=start){
                pq.poll();
            }
            pq.add(end);
        }

        bw.write(pq.size()+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
