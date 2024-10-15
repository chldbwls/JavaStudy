import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        char[] arr = num.toCharArray();
        
        int count_1 = 0;
        int count_0 = 0;
        int pre = arr[0] - '0';  // 첫 번째 문자를 기준으로 시작
        if (pre == 0) count_0++;  // 첫 번째 숫자가 0이면 0 그룹 카운트
        else count_1++;  // 첫 번째 숫자가 1이면 1 그룹 카운트

        for (int i = 1; i < arr.length; i++) {
            int now = arr[i] - '0';
            if (pre != now) {  // 이전 숫자와 다를 때 그룹 변화가 생김
                if (now == 0) {
                    count_0++;
                } else {
                    count_1++;
                }
                pre = now;
            }
        }

        bw.write(Math.min(count_1, count_0) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
