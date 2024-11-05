import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        long total=1;
        long k = (long)1e12;
        for(int i=1;i<=num;i++){
            total*=i;
            while(total%10==0){
                total/=10;
            }
            total=total%k;
        }
        total%=100000;
        String result = String.format("%05d", total);
        bw.write(result + "\n");


        bw.flush();
        bw.close();
        br.close();
    }
}