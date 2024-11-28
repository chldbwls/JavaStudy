import java.io.*;
import java.util.*;

public class Main {
    static char[][] arr;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 0;
        int right = N-1;
        int result_left = 0;
        int result_right = 0;
        int close_num = Integer.MAX_VALUE;
        while(left<right){
            int m = arr[left]+arr[right];
            if(Math.abs(m)<Math.abs(close_num)){
                close_num = m;
                result_left = left;
                result_right = right;
            }

            if(m>0){
                right--;
            }else if(m<0){
                left++;
            }else{
                break;
            }
        }

        bw.write(arr[result_left]+" "+arr[result_right]+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}