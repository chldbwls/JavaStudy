import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] list = new int[size];
        StringTokenizer qos= new StringTokenizer(br.readLine());
        for(int i=0;i<size;i++){
            list[i]=Integer.parseInt(qos.nextToken());
        }

        Deque<Integer> stackqueue = new ArrayDeque<>();

        StringTokenizer first_input = new StringTokenizer(br.readLine());
        for(int i=0;i<size;i++){
            if(list[i]==0){
                stackqueue.addLast(Integer.parseInt(first_input.nextToken()));
            }else{
                int a = Integer.parseInt(first_input.nextToken());
            }
        }

        int num = Integer.parseInt(br.readLine());
        StringTokenizer new_input = new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){
            int input = Integer.parseInt(new_input.nextToken());
            stackqueue.addFirst(input);
            bw.write(stackqueue.removeLast()+" ");
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}