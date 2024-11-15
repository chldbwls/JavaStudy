import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N-1];
        int pre = Integer.parseInt(br.readLine());
        for(int i=0;i<N-1;i++){
            int a = Integer.parseInt(br.readLine());
            arr[i]=a-pre;
            pre=a;
        }

        int a = GCD(arr[0],arr[1]);
        for(int i=2;i<N-1;i++){
            a=GCD(a,arr[i]);
        }

        int count =0;
        for(int i=0;i<N-1;i++){
            count=count+((arr[i]/a)-1);
        }

        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int GCD(int a, int b)
    {
        while(b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}