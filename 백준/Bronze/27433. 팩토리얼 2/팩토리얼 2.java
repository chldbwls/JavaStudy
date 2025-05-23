import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long result = fact(N);
        bw.write(result+"\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static long fact(int N)
    {
        if(N==0){
            return 1;
        }else{
            return N*fact(N-1);
        }
    }
}