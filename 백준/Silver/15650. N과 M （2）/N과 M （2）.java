

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int result[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = new int[M];
        backtrack(1,0);

        bw.flush();
        bw.close();
        br.close();
    }
    public static void backtrack(int start, int deep)
    {
        if(deep==M){
            for(int i=0;i<M;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=start;i<=N;i++){
            result[deep]=i;
            backtrack(i+1, deep+1);
        }
    }
}
