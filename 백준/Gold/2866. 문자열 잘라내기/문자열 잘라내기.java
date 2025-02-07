

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        List<char[]> arr = new ArrayList<>();

        for (int i = 0; i < R; i++) {
            arr.add(br.readLine().toCharArray());
        }

        int low = 0, high = R - 1, answer = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            Map<String, Boolean> map = new HashMap<>();
            boolean isDuplicate = false;

            for (int col = 0; col < C; col++) {
                StringBuilder sb = new StringBuilder();
                for (int row = mid; row < R; row++) {
                    sb.append(arr.get(row)[col]);
                }
                String str = sb.toString();
                if (map.containsKey(str)) {
                    isDuplicate = true;
                    break;
                }
                map.put(str, true);
            }

            if (isDuplicate) {
                high = mid - 1;
            } else {
                answer = mid;
                low = mid + 1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
