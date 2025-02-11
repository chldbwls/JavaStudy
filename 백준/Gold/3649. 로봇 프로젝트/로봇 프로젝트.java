
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input;

        while ((input = br.readLine()) != null) {  
            int x = Integer.parseInt(input) * 10000000; 
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);
            int start = 0;
            int end=n-1;
            boolean flag = false;
            while(start<end){
                int sum=arr[start]+arr[end];
                if(sum==x){
                    flag=true;
                    break;
                }else if(sum>x){
                    end--;
                }else{
                    start++;
                }
            }
    
            if(flag){
                bw.write("yes "+arr[start]+" "+arr[end]+"\n");
            }else{
                bw.write("danger"+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

