import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long result=1;
        for(int i=1;i<=N;i++){
            result*=i;
            while(result%10==0){
                result/=10;
            }
            result %= 100000000;
        }

        bw.write((result%10)+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}