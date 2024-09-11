import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int total=Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i<total;i++){
            int input = Integer.parseInt(st.nextToken());
            if(!map.containsKey(input)){
                map.put(input,1);
            }else{
                int count=map.get(input);
                map.remove(input);
                map.put(input,count+1);
            }
        }

        int check=Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<check;i++){
            int num=Integer.parseInt(st2.nextToken());
            if(map.containsKey(num)){
                bw.write(map.get(num)+" ");
            }else{
                bw.write(0+" ");
            }
        }
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}