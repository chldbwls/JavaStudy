import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=num;i++){
            queue.add(i);
        }

        while(queue.size()!=1){
            queue.remove();
            int a = queue.remove();
            queue.add(a);
        }

        int last = queue.remove();
        bw.write(last+"\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}