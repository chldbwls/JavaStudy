import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new ArrayDeque<>();
        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int q = Integer.parseInt(st.nextToken());
            if(q==1){
                int num = Integer.parseInt(st.nextToken());
                deque.addFirst(num);
            }else if(q==2){
                int num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
            }else if(q==3){
                if(deque.isEmpty()){
                    bw.write(-1+"\n");
                }else{
                    bw.write(deque.removeFirst()+"\n");
                }
            }else if(q==4){
                if(deque.isEmpty()){
                    bw.write(-1+"\n");
                }else{
                    bw.write(deque.removeLast()+"\n");
                }
            }else if(q==5){
                bw.write(deque.size()+"\n");
            }else if(q==6){
                if(deque.isEmpty()){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            }else if(q==7){
                if(deque.isEmpty()){
                    bw.write(-1+"\n");
                }else{
                    bw.write(deque.getFirst()+"\n");
                }
            }else if(q==8){
                if(deque.isEmpty()){
                    bw.write(-1+"\n");
                }else{
                    bw.write(deque.getLast()+"\n");
                }
            }
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}