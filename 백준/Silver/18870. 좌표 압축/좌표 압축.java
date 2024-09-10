import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // BufferedReader와 BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 복사 및 정렬
        int[] copy_arr = arr.clone();
        Arrays.sort(copy_arr);

        // 좌표 압축을 위한 Map 생성
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int num : copy_arr) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }

        // 좌표 압축된 값으로 변환
        for (int i = 0; i < size; i++) {
            arr[i] = map.get(arr[i]);
        }

        // 출력
        for (int i = 0; i < size; i++) {
            bw.write(arr[i] + " ");
        }
        bw.newLine();

        // BufferedWriter 종료
        bw.flush();
        bw.close();
        br.close();
    }
}