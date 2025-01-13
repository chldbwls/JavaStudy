

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static boolean visited[];
    static int result[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        result = new int[M];
        backtrack(0);

        bw.flush();
        bw.close();
        br.close();
    }
    public static void backtrack(int deep)
    {
        if(deep==M){
            for(int i=0;i<M;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=1;i<=N;i++){
            if(!visited[i]){
                visited[i]=true;
                result[deep]=i;
                backtrack(deep+1);
                visited[i]=false;
            }
        }
    }
}
