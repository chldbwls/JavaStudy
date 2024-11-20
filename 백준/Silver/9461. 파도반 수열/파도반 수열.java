import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[101];
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;
        for(int j=4;j<=100;j++){
            arr[j]=arr[j-2]+arr[j-3];
        }
        for(int i=0;i<N;i++){
            int a = Integer.parseInt(br.readLine());
            bw.write(arr[a]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}