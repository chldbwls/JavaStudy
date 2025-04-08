

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[][] arr = new int[N][2];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
        int[] bag = new int[K];
        for(int i=0;i<K;i++){
            bag[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(bag);

        long result=0;
        int j=0;
        for(int i=0;i<K;i++){
            while(j<N&&arr[j][0]<=bag[i]){
                pq.add(arr[j][1]);
                j++;
            }
            if(!pq.isEmpty()){
                result+=pq.poll();
            }
        }

        bw.write(result+"\n");



        bw.flush();
        bw.close();
        br.close();
    }
}
