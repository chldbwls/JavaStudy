

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine());
        int[] arr =new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<N;i++){
            if(arr[i]>count){
                break;
            }
            count+=arr[i];
        }

        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
