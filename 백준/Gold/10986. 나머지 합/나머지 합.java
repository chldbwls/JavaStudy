import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken()); // 배열 크기
        int num = Integer.parseInt(st.nextToken()); // 나눌 수
        
        int[] arr = new int[size];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        // 나머지의 빈도수를 저장할 배열
        long[] remainderCount = new long[num];
        remainderCount[0] = 1; // 누적합 % num == 0 인 경우 미리 1로 설정 (초기값)

        int sum = 0; // 누적 합
        long count = 0; // 나눠떨어지는 구간의 수
        for (int i = 0; i < size; i++) {
            sum = (sum + arr[i]) % num; // 누적합의 나머지
            if (sum < 0) sum += num; // 나머지가 음수가 되지 않도록 처리
            
            // 동일한 나머지를 가진 이전 구간이 있으면 그만큼 카운트 증가
            count += remainderCount[sum];

            // 현재 누적합의 나머지를 나머지 카운트 배열에 추가
            remainderCount[sum]++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
