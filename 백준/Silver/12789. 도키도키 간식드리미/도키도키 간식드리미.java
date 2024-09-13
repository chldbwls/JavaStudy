import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> stack1 = new ArrayDeque<>();
        for (int i = 0; i < num; i++) {
            stack1.addLast(Integer.parseInt(st.nextToken()));
        }

        int count = 1;
        Deque<Integer> stack2 = new ArrayDeque<>();
        boolean valid = true;

        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty() && stack1.getFirst() == count) {
                stack1.removeFirst();
                count++;
            } else if (!stack2.isEmpty() && stack2.getFirst() == count) {
                stack2.removeFirst();
                count++;
            } else if (!stack1.isEmpty()) {
                stack2.addFirst(stack1.removeFirst());
            } else {
                valid = false;
                break;
            }
        }

        if (valid) {
            bw.write("Nice\n");
        } else {
            bw.write("Sad\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
