

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0;i<N;i++){
            int count = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int j=0;j<count;j++){
                StringTokenizer st= new StringTokenizer(br.readLine());
                String comm = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                if(comm.equals("I")){
                    map.put(num,map.getOrDefault(num, 0)+1);
                }else{
                    if(map.isEmpty()){
                        continue;
                    }else{
                        if(num==-1){
                            int value = map.get(map.firstKey());
                            if(value>1){
                                map.put(map.firstKey(),value-1);
                            }else{
                                map.remove(map.firstKey());
                            }
                        }else{
                            int value = map.get(map.lastKey());
                            if(value>1){
                                map.put(map.lastKey(),value-1);
                            }else{
                                map.remove(map.lastKey());
                            }
                        }
                    }
                }
            }
            if(map.isEmpty()){
                bw.write("EMPTY\n");
            }else{
                bw.write(map.lastKey()+" "+map.firstKey()+"\n");
            }
        }
        

        bw.flush();
        bw.close();
        br.close();
    }
}
