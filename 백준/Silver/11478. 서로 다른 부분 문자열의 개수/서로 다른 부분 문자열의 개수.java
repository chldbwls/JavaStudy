import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        Map<String, Integer> map = new HashMap<>();

        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<=input.length();j++){
                String str = input.substring(i, j);
                if(!map.containsKey(str)){
                    map.put(str,1);
                }
            }
        }

        bw.write(map.size()+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}