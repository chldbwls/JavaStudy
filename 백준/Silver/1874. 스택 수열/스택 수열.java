
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();

        int count = 1;  // stack에 들어갈 숫자
        for (int i = 1; i <= size; i++) {  // i 배열(수열) 확인할 변수 
            while (count <= arr[i]) {
                stack.push(count);
                result.append("+\n");
                count++;
            }
            if (stack.peek() == arr[i]) {
                stack.pop();
                result.append("-\n");
            } else {
                result.setLength(0); 
                result.append("NO");
                break;
            }
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
