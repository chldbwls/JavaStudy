import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=1;i<=N;i++){
            q.addLast(i);
        }

        bw.write("<");
        while(q.size()!=1){
            for(int i=1;i<K;i++){
                q.addLast(q.removeFirst());
            }
            bw.write(q.removeFirst()+", ");
        }
        bw.write(q.removeFirst()+">");

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}