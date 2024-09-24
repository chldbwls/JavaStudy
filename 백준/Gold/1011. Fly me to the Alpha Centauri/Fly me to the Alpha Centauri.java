import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int cen = 1;
        int count =2;
        int dis = 0;
        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            dis = y - x;
        
            int maxMove = (int)Math.sqrt(dis);  // 최대 이동량을 미리 계산
            int maxMoveSquare = maxMove * maxMove;
        
            if (dis == maxMoveSquare) {
                count = 2 * maxMove - 1;
            } else if (dis <= maxMoveSquare + maxMove) {
                count = 2 * maxMove;
            } else {
                count = 2 * maxMove + 1;
            }
        
            bw.write(count + "\n");
        }
        

        bw.flush();
        bw.close();
        br.close();
    }
}