

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long total = Long.parseLong(br.readLine());
        for(long i=0;i<total;i++){
            long num = Long.parseLong(br.readLine());
            bw.write(test(num)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
    public static long test(long num){
        while(true){
            if(test2(num)){
                return num;
            }
            num++;
        }
    }

    public static boolean test2(long num){
        if(num<2){
            return false;
        }else if(num==2){
            return true;
        }else if(num%2==0){
            return false;
        }
        long a = (long)Math.sqrt(num);
        for(long i=3;i<=a;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
