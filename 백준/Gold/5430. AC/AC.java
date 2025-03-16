

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            char[] c = s.toCharArray();

            int n = Integer.parseInt(br.readLine());
            Deque<Integer> dq = new LinkedList<>();

            String arrStr = br.readLine();
            arrStr = arrStr.substring(1, arrStr.length() - 1);

            if (n > 0) {
                String[] arr = arrStr.split(",");
                for (String num : arr) {
                    dq.addLast(Integer.parseInt(num));
                }
            }

            boolean R = false;
            boolean F = false;

            for (char cmd : c) {
                if (cmd == 'R') {
                    R = !R;
                } else {
                    if (dq.isEmpty()) {
                        F = true;
                        break;
                    }
                    if (R) {
                        dq.removeLast();
                    } else {
                        dq.removeFirst();
                    }
                }
            }

            if (F) {
                bw.write("error\n");
            } else {
                bw.write("[");
                while (!dq.isEmpty()) {
                    bw.write(String.valueOf(R ? dq.pollLast() : dq.pollFirst()));
                    if (!dq.isEmpty()) {
                        bw.write(",");
                    }
                }
                bw.write("]\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
