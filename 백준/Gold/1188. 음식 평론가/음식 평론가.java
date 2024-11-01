import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int gcd = gcd(s,h);
        int cuts = h - gcd;

        bw.write(cuts+"\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}