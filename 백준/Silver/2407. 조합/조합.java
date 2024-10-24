import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BigInteger up =new BigInteger("1");
        BigInteger down =new BigInteger("1");
        for(int i=n;i>n-m;i--){
            up=up.multiply(BigInteger.valueOf(i));
        }

        for(int i=1;i<=m;i++){
            down=down.multiply(BigInteger.valueOf(i));
        }

        bw.write(up.divide(down)+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}