import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        if(N==1){
            bw.write(1+"\n");
        }else if(N==2){
            bw.write(2+"\n");
        }else{
            arr[1]=1;
            arr[2]=2;
            for(int i=3;i<=N;i++){
                arr[i]=(arr[i-1]+arr[i-2])%15746;
            }
            bw.write(arr[N]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}