

import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;  //지도 
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};   //상하좌우 이동 
    static int[] dy = {0,0,-1,1};
    static List<Integer> size_arr;   //단지 크기 
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //지도 크기 

        map = new int[N][N];
        visited = new boolean[N][N];
        size_arr = new ArrayList<>();
        //지도 입력 
        for(int i=0;i<N;i++){
            String input = br.readLine();
            for(int j=0;j<N;j++){
                map[i][j]=input.charAt(j)-'0';
            }
        } 

        //탐색 
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(map[i][j]==1 && !visited[i][j]){
                    int size = dfs(i,j,N);
                    size_arr.add(size);
                }
            }
        }

        Collections.sort(size_arr);
        bw.write(size_arr.size()+"\n");
        for(int i : size_arr){
            bw.write(i+"\n");
        }


        bw.flush();
        bw.close();
        br.close();
    }

    public static int dfs(int x, int y, int N)
    {
        visited[x][y] = true;
        int size = 1;
        for(int dir =0 ; dir<4 ; dir++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(nx>=0 && ny>=0 && nx< N && ny<N){
                if(map[nx][ny] ==1 && !visited[nx][ny]){
                    size+=dfs(nx,ny,N);
                }
            }
        }
        return size;
    }
}
