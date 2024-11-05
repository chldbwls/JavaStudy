import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int total=Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int count =0;
        while(a!=b){
            if(a%2==1){
                a+=1;
            }
            if(b%2==1){
                b+=1;
            }
            a/=2;
            b/=2;
            count++;
        }

        bw.write(count+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}