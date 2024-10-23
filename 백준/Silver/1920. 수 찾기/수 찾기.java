import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){
            map.put(Integer.parseInt(st.nextToken()),1);
        }

        num = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){
            int a = Integer.parseInt(st2.nextToken());
            if(map.containsKey(a)){
                bw.write(1+"\n");
            }else{
                bw.write(0+"\n");
            }
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}