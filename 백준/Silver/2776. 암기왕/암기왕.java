

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            Map<Integer,Integer> map = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st= new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                map.put(Integer.parseInt(st.nextToken()),j);
            }

            N=Integer.parseInt(br.readLine());
            st= new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                if(map.containsKey(Integer.parseInt(st.nextToken()))){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}