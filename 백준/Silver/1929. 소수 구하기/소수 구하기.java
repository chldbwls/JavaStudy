import java.io.*;
import java.util.*;

public class Main {
    static boolean arr[];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        arr = new boolean[end+1];
        Arrays.fill(arr, true);
        test(end);
        for(int i=start;i<=end;i++){
            if(arr[i]){
                bw.write(i+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
    public static void test(int end){
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i*i<=end;i++){
            if(arr[i]){
                for(int j=i*i;j<=end;j+=i){
                    arr[j]=false;
                }
            }
        }
    }
}