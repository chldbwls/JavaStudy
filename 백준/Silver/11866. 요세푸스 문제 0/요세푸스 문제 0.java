import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int part = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=size;i++){
            queue.add(i);
        }

        int[] arr = new int[size];
        int i=0;
        while(queue.size()!=1){
            for(int count=0;count<part-1;count++){
                int a = queue.remove();
                queue.add(a);
            }
            arr[i++]=queue.remove();
        }

        arr[i]=queue.remove();

        bw.write("<");
        for(int j=0;j<size-1;j++){
            bw.write(arr[j]+", ");
        }
        bw.write(arr[size-1]+">");

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}