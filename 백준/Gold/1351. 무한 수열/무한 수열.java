import java.io.*;
import java.util.*;

public class Main {
    static Map<Long, Long> map = new HashMap<>();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long P = Integer.parseInt(st.nextToken());
        long Q = Integer.parseInt(st.nextToken());

        map.put(0L, 1L); 

        long result = computeValue(N, P, Q);
        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    private static long computeValue(long n, long P, long Q) {
        if (map.containsKey(n)) {
            return map.get(n);  
        }

        long value = computeValue(n / P, P, Q) + computeValue(n / Q, P, Q);
        map.put(n, value);
        return value;
    }
}
