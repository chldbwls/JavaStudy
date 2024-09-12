import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")){
                int input = Integer.parseInt(st.nextToken());
                queue.add(input);
            }else if(str.equals("pop")){
                if(queue.isEmpty()){
                    bw.write(-1+"\n");
                }else {
                    bw.write(queue.remove()+"\n");
                }
            }else if(str.equals("size")){
                bw.write(queue.size()+"\n");
            }else if(str.equals("empty")){
                if(queue.isEmpty()){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            }else if(str.equals("front")){
                if(queue.isEmpty()){
                    bw.write(-1+"\n");
                }else{
                    bw.write(queue.peek()+"\n");
                }
            }else if(str.equals("back")){
                if(queue.isEmpty()){
                    bw.write(-1+"\n");
                }else{
                    Integer lastElement = ((LinkedList<Integer>)queue).getLast();
                    bw.write(lastElement+"\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}