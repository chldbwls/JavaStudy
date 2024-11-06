import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        long result = ABC(a, b, c);
        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static long ABC(long a, long b, long c) {
        if (b == 0) {
            return 1L;
        }
        long half = ABC(a, b / 2, c) % c;
        if (b % 2 == 0) {
            return (half * half) % c;
        } else {
            return (a % c * half % c * half % c) % c;
        }
    }
}
