import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int index = Integer.parseInt(br.readLine());
        int num = 666;
        int count=0;
        while(true){
            if(String.valueOf(num).contains("666")){
                count++;
            }

            if(count==index){
                bw.write(num+"\n");
                break;
            }
            num++;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}