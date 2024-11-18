import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new HashMap<>();
        for(int i =0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if(map.containsKey(a)||map.containsKey(b)){
                map.put(a,1);
                map.put(b,1);
            }
            if(a.equals("ChongChong")||b.equals("ChongChong")){
                map.put(a,1);
                map.put(b,1);
            }
        }

        bw.write(map.size()+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}