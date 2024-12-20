

import java.io.*;
import java.util.*;

public class Main {
    static List<Integer>[] gra;
    static int count=0;
    static boolean[] visited;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //컴터 수 
        int K = Integer.parseInt(br.readLine());  //간선 수 

        gra = new ArrayList[N+1];
        visited = new boolean[N+1];
        for(int i=1;i<=N;i++){
            gra[i]=new ArrayList<>();
            visited[i]=false;
        }

        for(int i=1;i<=K;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            gra[a].add(b);
            gra[b].add(a);
        }

        for(int i=1;i<=N;i++){
            if(gra[i]!=null){
                Collections.sort(gra[i]);
            }
        }

        dfs(1);
        bw.write(count-1+"\n");


        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int r)
    {
        visited[r]=true;
        count++;
        for(int i:gra[r]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
}
