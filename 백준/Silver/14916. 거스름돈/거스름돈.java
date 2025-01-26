

import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count =0;

        while(N>0){
            if(N%5==0){
                count+=N/5;
                N=0;
                break;
            }else{
                N-=2;
                count++;
            }
        }
        if(N<0){
            bw.write(-1+"\n");
        }else{
            bw.write(count+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
