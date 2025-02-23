


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 64;
        int half = 64;
        int count =1;
        while(sum!=N){
            half = half>>1;
            if(sum-half>=N){
                sum=sum-half;
            }else{
                count++;
            }
        }

        bw.write(count+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}



