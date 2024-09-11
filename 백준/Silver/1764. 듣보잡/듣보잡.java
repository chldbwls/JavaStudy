import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int noli=Integer.parseInt(st.nextToken());
        int nosee=Integer.parseInt(st.nextToken());

        Map<String,Integer> map1 = new HashMap<>();
        for(int i=0;i<noli;i++){
            //String name = br.readLine();
            map1.put(br.readLine(),1);
        }

        int count =0;
        Map<String, Integer> map2 = new HashMap<>();
        for(int i=0;i<nosee;i++){
            String name = br.readLine();
            if(map1.containsKey(name)){
                count++;
                map2.put(name,1);
            }
        }

        List<String> new_list = new ArrayList<>(map2.keySet());
        Collections.sort(new_list);

        bw.write(count+"\n");
        for(String name:new_list){
            bw.write(name+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}