import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        while (B != 0) {
            long temp = B;
            B = A % B;
            A = temp;
        }

        for(int i=0;i<A;i++){
            bw.write("1");
        }


        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}