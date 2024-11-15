import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = N/5;
        int result=0;
        boolean flag = true;
        for(int i=count;i>=0;i--){
            int a = N-(5*i);
            if(a%3==0){
                result=i+(a/3);
                flag=false;
                break;
            }
        }
        if(flag){
            bw.write(-1+"\n");
        }else{
            bw.write(result+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}