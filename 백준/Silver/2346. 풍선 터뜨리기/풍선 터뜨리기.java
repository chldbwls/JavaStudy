import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();  // deque에 [풍선 번호, 이동 값] 저장

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= size; i++) {
            int move = Integer.parseInt(st.nextToken());
            deque.addLast(new int[]{i, move});  // 풍선 번호와 이동값 저장
        }

        while (!deque.isEmpty()) {
            int[] current = deque.removeFirst();  // deque에서 첫 번째 풍선 제거
            bw.write(current[0] + " ");  // 풍선 번호 출력

            if (deque.isEmpty()) break;

            int move = current[1];  // 이동값 가져오기

            if (move > 0) {
                // 이동값이 양수일 때: 앞으로 (move-1) 만큼 이동
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.removeFirst());
                }
            } else {
                // 이동값이 음수일 때: 뒤로 (Math.abs(move)) 만큼 이동
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.removeLast());
                }
            }
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
