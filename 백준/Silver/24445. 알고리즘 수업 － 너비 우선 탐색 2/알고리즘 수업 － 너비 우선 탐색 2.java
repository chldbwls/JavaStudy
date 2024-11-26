

import java.io.*;
import java.util.*;

public class Main {
    static List<Integer>[] gra;
    static int[] result;
    static boolean[] visited;
    static int cnt = 1;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        gra = new ArrayList[N+1];
        result = new int[N+1];
        visited = new boolean[N+1];
        for(int i=1;i<=N;i++){
            gra[i]=new ArrayList<>();
            result[i] = 0;
            visited[i]=false;
        }


        for(int i=1;i<=M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            gra[a].add(b);
            gra[b].add(a);
        }

        for(int i=1;i<=N;i++){
            if(gra[i]!=null){
                Collections.sort(gra[i]);
                Collections.reverse(gra[i]);
            }
        }

        bfs(R);

        for(int i=1;i<=N;i++){
            bw.write(result[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void bfs(int r)
    {
        Deque<Integer> q = new ArrayDeque<>();
        q.add(r);
        visited[r]=true;   //방문 처리하고 
        while(!q.isEmpty()){
            int cur = q.poll();
            result[cur]=cnt++;

            for(int next : gra[cur]){
                if(!visited[next]){
                    q.add(next);
                    visited[next]=true;
                }
            }
        }

    }
}
