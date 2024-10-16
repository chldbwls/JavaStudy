import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        BigInteger[] arr = new BigInteger[30];
        arr[0] = BigInteger.ONE; 
        for (int i = 1; i < 30; i++) {
            arr[i] = arr[i - 1].multiply(BigInteger.valueOf(i)); 
        }

        for(int i=0;i<size;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            BigInteger num = arr[right].divide(arr[left].multiply(arr[right - left]));
            bw.write(num+"\n");
        }



        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}