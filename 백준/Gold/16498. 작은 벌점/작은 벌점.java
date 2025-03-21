import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] a = new int[A];
        int[] b = new int[B];
        int[] c = new int[C];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<A;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<B;i++){
            b[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(b);

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<C;i++){
            c[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(c);

        int re=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int k=0;
        while(i<A&&j<B&&k<C){
            int max=Math.max(a[i], Math.max(b[j], c[k]));
            int min=Math.min(a[i], Math.min(b[j], c[k]));
            re=Math.min(re,max-min);

            if(min==a[i]){
                i++;
            }else if(min==b[j]){
                j++;
            }else{
                k++;
            }
        }

        bw.write(re+"\n");


        bw.flush();
        bw.close();
        br.close();
    }
}