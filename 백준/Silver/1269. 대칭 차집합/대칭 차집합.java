import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map_a = new HashMap<>();
        for(int i=0;i<a;i++){
            map_a.put(Integer.parseInt(st2.nextToken()),1);
        }

        int count=0;
        StringTokenizer input_b = new StringTokenizer(br.readLine());
        for(int i=0;i<b;i++){
            int num = Integer.parseInt(input_b.nextToken());
            if(map_a.containsKey(num)){
                map_a.remove(num);
            }else{
                count++;
            }
        }

        bw.write(count+map_a.size()+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}