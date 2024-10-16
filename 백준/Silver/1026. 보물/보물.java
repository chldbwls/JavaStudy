import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[] A = new int[size];
        int[] B = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<size;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<size;i++){
            B[i]=Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(A);
        int now = 0;
        int total=0;
        for(int i=0;i<size;i++){
            int max =0;
            int index=0;
            for(int j=0;j<size;j++){
                if(B[j]>max){
                    max=B[j];
                    index=j;
                }
            }  
            B[index]=0;
            total = total+(A[now++]*max);
            
        }

        bw.write(total+"\n");

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}