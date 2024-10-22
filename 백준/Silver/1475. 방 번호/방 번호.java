import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num =  br.readLine();
        int[] arr = new int[9];
        char[] num_arr = num.toCharArray();
        for(int i=0;i<num_arr.length;i++){
            int a = num_arr[i]-'0';
            if(a==9){
                arr[6]++;
            }else{
                arr[a]++;
            }
        }
        if(arr[6]%2==1){
            arr[6]=(arr[6]/2)+1;
        }else{
            arr[6]/=2;
        }

        int max = 0;
        for(int i=0;i<9;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        bw.write(max+"\n");

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}