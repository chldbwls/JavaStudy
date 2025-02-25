


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        List<Integer> plus = new ArrayList<>();
        List<Integer> min = new ArrayList<>();
        
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            if(num<0){
                min.add(num);
            }else{
                plus.add(num);
            }
        }

        Collections.sort(min);
        Collections.sort(plus,Collections.reverseOrder());
        
        int count =0;
        int max_dis = 0;

        for(int i=0;i<min.size();i+=M){
            int dis = Math.abs(min.get(i));
            count+=dis*2;
            max_dis=Math.max(max_dis,dis);
        }

        for(int i=0;i<plus.size();i+=M){
            int dis = Math.abs(plus.get(i));
            count+=dis*2;
            max_dis= Math.max(max_dis,dis);
        }

        count-=max_dis;
        bw.write(count+"\n");


        bw.flush();
        bw.close();
        br.close();
    }
}



