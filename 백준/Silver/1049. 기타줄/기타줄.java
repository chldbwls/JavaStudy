import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int N_a = N/6;
        int N_b = N%6;

        int min_6 = 0;
        int min_1 = 0;

        int total = 0;

        for(int i=0;i<M;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            if(i==0){
                min_6 = a;
                min_1 = b;
            }else{
                min_6 = Math.min(a, min_6);
                min_1 = Math.min(b, min_1);
            }
        }

        //다 패키지 
        int a_1 = min_6 * (N_a+1);

        //다 개별 
        int a_2 = min_1 * N;
        //섞어서 
        int a_3 = (min_6*N_a)+(min_1*N_b);

        total = Math.min(a_1,Math.min(a_2,a_3));


        bw.write(total+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}