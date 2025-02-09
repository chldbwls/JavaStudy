
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st =new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count=0;
        for(int k=0;k<N;k++){
            int target=arr[k];
            int i=0;
            int j=N-1;
            while(i<j){
                if(i==k){
                    i++;
                    continue;
                }else if(j==k){
                    j--;
                    continue;
                }

                int sum = arr[i]+arr[j];

                if(sum==target){
                    count++;
                    break;
                }else if(sum<target){
                    i++;
                }else{
                    j--;
                }
            }
        }

        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
