import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < size; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int totalCost = 0;

        // 카드 묶음을 합치기
        while (pq.size() > 1) {
            int first = pq.poll();   // 가장 작은 묶음
            int second = pq.poll();  // 두 번째로 작은 묶음
            int cost = first + second; // 두 묶음을 합치는 비용

            totalCost += cost; // 총 비용 누적
            pq.add(cost); // 합쳐진 묶음을 큐에 추가
        }

        bw.write(totalCost + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}