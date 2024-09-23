import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int check = K;

        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        int count=0;
        for(int i=N-1;i>=0;i--){
            if(check>=arr[i]){
                count=count+(check/arr[i]);
                check=check-((check/arr[i])*arr[i]);
            }
            if(check==0){
                break;
            }
        }

        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}