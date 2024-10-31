import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        long total=0;
        int digit=1;
        long start = 1;

        while(num>=start){
            long end = Math.min(num,(start*10)-1);
            total+=(end-start+1)*digit;
            start*=10;
            digit++;
        }

        bw.write(total%1234567+"\n");


        bw.flush();
        bw.close();
        br.close();
    }
}