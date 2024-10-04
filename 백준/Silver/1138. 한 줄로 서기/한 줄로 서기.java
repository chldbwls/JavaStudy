import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];  // 입력 배열
        int[] result = new int[size];  // 결과 배열

        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 사람을 위치에 배치
        for (int i = 0; i < size; i++) {
            int count = arr[i];  // 자신보다 큰 사람이 있어야 할 수
            for (int j = 0; j < size; j++) {
                if (count == 0 && result[j] == 0) {
                    result[j] = i + 1;  // 사람 번호는 1부터 시작하므로 i + 1
                    break;
                } else if (result[j] == 0) {
                    count--;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < size; i++) {
            bw.write(result[i] + " ");
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
