

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

        dfs(R);

        for(int i=1;i<=N;i++){
            bw.write(result[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int r)
    {
        visited[r]=true;   //방문 처리하고 
        result[r]=cnt++;    //몇번째로 방문 되었는지 확인함 

        for(int i : gra[r]){   //위에서 정렬함 -> 인접한 노드 중 숫자가 작은 노드로 가서 탐색한다는 의미임 
            if(!visited[i]){  //방문을 아직 하지 않았으면 
                dfs(i);  //그거에 대한 탐색 시작 
            }
        }
    }
}
