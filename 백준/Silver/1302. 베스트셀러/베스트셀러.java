import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];
        for(int i=0;i<num;i++){
            arr[i]=br.readLine();
        }

        Arrays.sort(arr);
        int count=1;

        String pre = arr[0];
        int pre_count=1;
        for(int i=1;i<num;i++){
            if(arr[i-1].equals(arr[i])){
                count++;
            }else{
                if(pre_count<count){
                    pre_count=count;
                    pre = arr[i-1];
                }
                count=1;
            }
        }

        if(pre_count<count){
            pre = arr[num-1];
        }

        bw.write(pre+"\n");

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}