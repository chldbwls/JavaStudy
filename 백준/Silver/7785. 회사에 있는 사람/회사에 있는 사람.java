import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1=st.nextToken();
            String str2=st.nextToken();
            if(!map.containsKey(str1)){
                map.put(str1,str2);
            }else{
                map.remove(str1);
                map.put(str1,str2);
            }
        }

        Map<String, String> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(map);
        
        for(Map.Entry<String, String> entry : sortedMap.entrySet()){
            if(entry.getValue().equals("enter")){
                bw.write(entry.getKey()+"\n");
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}