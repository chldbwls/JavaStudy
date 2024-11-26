

import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] g;
    static boolean[] visited;
    static int[] result;
    static int cnt = 1;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());  // 정점 개수
        int M = Integer.parseInt(st.nextToken());  // 간선 개수
        int R = Integer.parseInt(st.nextToken());  // 시작점

        g = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        result = new int[N + 1];

        // 그래프 초기화
        for (int i = 1; i <= N; i++) {
            g[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            g[a].add(b);
            g[b].add(a);
        }

        // 정점별 인접 리스트 정렬
        for (int i = 1; i <= N; i++) {
            if (g[i] != null) {
                Collections.sort(g[i]);
            }
        }

        // DFS 실행
        dfs(R);

        // 결과 출력
        for (int i = 1; i <= N; i++) {
            bw.write(result[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int r) {
        visited[r] = true;
        result[r] = cnt++;

        for (int i : g[r]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
