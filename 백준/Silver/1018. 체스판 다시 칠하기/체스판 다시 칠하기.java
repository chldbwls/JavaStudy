

import java.io.*;
import java.util.*;

public class Main {
    static char[][] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            arr[i] = str.toCharArray();
        }

        int minRepaints = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                minRepaints = Math.min(minRepaints, Math.min(countRepaints(i, j, 'W'), countRepaints(i, j, 'B')));
            }
        }

        bw.write(String.valueOf(minRepaints)+"\n");
        bw.flush();
        bw.close();
        br.close();
    }

    static int countRepaints(int startRow, int startCol, char firstColor) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char color = ((i + j) % 2 == 0) ? firstColor : (firstColor == 'W' ? 'B' : 'W');
                if (arr[startRow + i][startCol + j] != color) {
                    count++;
                }
            }
        }
        return count;
    }
}
