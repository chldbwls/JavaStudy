

import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;  //지도 
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};   //상하좌우 이동 
    static int[] dy = {0,0,-1,1};
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());    //테스트 케이스 개수 
        for(int i=0;i<T;i++){
            int count =0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());   //가로 
            int N = Integer.parseInt(st.nextToken());   //세로
            int K = Integer.parseInt(st.nextToken());  //베추 개수 
            map=new int[M][N];
            visited = new boolean[M][N];
            for(int j=0;j<K;j++){   //베추 지도 
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y]=1;
            }
            for(int a=0;a<M;a++){
                for(int b=0;b<N;b++){
                    if(map[a][b]==1&&!visited[a][b]){
                        dfs(a,b,M,N);
                        count++;
                    }
                }
            }
            bw.write(count+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
    public static void dfs(int x, int y, int M, int N)
    {
        visited[x][y]=true;
        for(int dir=0; dir<4;dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(nx>=0&&nx<M&&ny>=0&&ny<N){
                if(!visited[nx][ny]&&map[nx][ny]==1){
                    dfs(nx,ny,M,N);
                }
            }
        }
    }
}
