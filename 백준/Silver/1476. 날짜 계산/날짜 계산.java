

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int count = 1;
        while(true){
            if((count-a)%15==0&&(count-b)%28==0&&(count-c)%19==0){
                break;
            }
            count++;
        }

        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
