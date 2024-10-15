import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());  // 끊어진 기타줄 개수
        int M = Integer.parseInt(st.nextToken());  // 브랜드 수

        int min_6 = Integer.MAX_VALUE;  // 6개 세트의 최소 가격
        int min_1 = Integer.MAX_VALUE;  // 1개 개별 가격의 최소 가격

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());  // 6개 세트 가격
            int b = Integer.parseInt(st2.nextToken());  // 1개 가격
            min_6 = Math.min(a, min_6);
            min_1 = Math.min(b, min_1);
        }

        // 1. 패키지로만 구매하는 경우
        int totalPackageOnly = ((N / 6) + 1) * min_6;
        // 2. 개별로만 구매하는 경우
        int totalIndividualOnly = N * min_1;
        // 3. 패키지와 개별을 조합해서 구매하는 경우
        int totalMixed = (N / 6) * min_6 + (N % 6) * min_1;

        // 세 가지 경우 중 최소값 선택
        int total = Math.min(totalPackageOnly, Math.min(totalIndividualOnly, totalMixed));
        
        bw.write(total + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
