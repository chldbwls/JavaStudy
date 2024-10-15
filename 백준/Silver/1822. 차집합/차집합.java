import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a_size = Integer.parseInt(st.nextToken());
        int b_size = Integer.parseInt(st.nextToken());

        Map<Integer,Integer> map_a = new HashMap<>();
        Map<Integer,Integer> map_b = new HashMap<>();

        StringTokenizer st_a = new StringTokenizer(br.readLine());
        for(int i =0;i<a_size;i++){
            map_a.put(i,Integer.parseInt(st_a.nextToken()));
        }

        StringTokenizer st_b = new StringTokenizer(br.readLine());
        for(int i =0;i<b_size;i++){
            map_b.put(Integer.parseInt(st_b.nextToken()),1);
        }

        for(int i=0;i<a_size;i++){
            if(map_b.containsKey(map_a.get(i))){
                map_a.remove(i);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map_a.entrySet());

        // 값(value)을 기준으로 오름차순 정렬
        entryList.sort(Map.Entry.comparingByValue());
        
        bw.write(map_a.size()+"\n");
        for (Map.Entry<Integer, Integer> entry : entryList) {
            bw.write(entry.getValue()+" ");
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}