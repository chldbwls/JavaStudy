


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];
        for(int i=0;i<N;i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            arr[i][2]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,(a,b)-> a[1]==b[1]?Integer.compare(a[2],b[2]):Integer.compare(a[1], b[1]));
        int count =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            while(!pq.isEmpty()&&pq.peek()<=arr[i][1]){
                pq.poll();
            }
            pq.offer(arr[i][2]);
            count=Math.max(count,pq.size());
        }
        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}



