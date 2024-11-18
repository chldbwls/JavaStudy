import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = fic(N);
        bw.write(result+"\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int fic(int N)
    {
        if(N==0){
            return 0;
        }else if(N==1){
            return 1;
        }
        else{
            return fic(N-1)+fic(N-2);
        }
    }
}