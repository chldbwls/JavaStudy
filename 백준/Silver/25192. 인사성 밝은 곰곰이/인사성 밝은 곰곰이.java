import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count=0;
        Map<String,Integer> map = new  HashMap<>();
        while(N!=0){
            String str = br.readLine();
            if(str.equals("ENTER")){
                map.clear();
            }else{
                if(!map.containsKey(str)){
                    count++;
                }
                map.put(str,1);
            }
            N--;
        }
        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}