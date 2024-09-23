import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] arr=new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int sum=0;
        int pre=0;
        Arrays.sort(arr);
        for(int i=0;i<size;i++){
            pre=pre+arr[i];
            sum+=pre;
        }

        bw.write(sum+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}