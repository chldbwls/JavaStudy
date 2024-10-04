import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        double start_num = 0;
        while(true){
            start_num=((double)N/(double)L)-((double)L/2.0)+0.5;
            if(start_num%1==0&&start_num>=0.0){
                for(int i=0;i<L;i++){
                    bw.write((int)start_num+i+" ");
                }
                break;
            }else{
                L++;
            }
            if(N<L||L>100){
                bw.write(-1+"\n");
                break;
            }
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}