
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i=0;i<N;i++){   //그 자체로 무게를 만족하는 경우 
            if(arr[i]==C){
                bw.write(1+"\n");
                bw.flush();
                return;
            }
        }

        //두 개를 합쳐서 무게를 만족하는 경우 
        int start =0;
        int end =N-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==C){
                bw.write(1+"\n");
                bw.flush();
                return;
            }else if(sum<C){
                start++;
            }else{
                end--;
            }
        }

        //세 개를 합쳐서 무게를 만족하는 경우 
        for(int i=0;i<N-2;i++){
            start=i+1;
            end=N-1;
            while(start<end){
                int sum=arr[start]+arr[i]+arr[end];
                if(sum==C){
                    bw.write(1+"\n");
                    bw.flush();
                    return;
                }else if(sum<C){
                    start++;
                }else{
                    end--;
                }
            }
        }
        bw.write(0+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}

