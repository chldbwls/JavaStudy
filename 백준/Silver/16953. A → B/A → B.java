

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int count =1;
        boolean flag = true;
        while(B>A){
            if(B%2==0){
                B=B/2;
            }else if(B%10==1){
                B=B/10;
            }else{
                break;
            }
            count++;
        }

        if(A==B){
            bw.write(count+"\n");
        }else{
            bw.write(-1+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
