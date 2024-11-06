import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int count =0;
        for(int i=0;i<num;i++){
            Map<Character, Integer> map = new HashMap<>();
            boolean flag = true;
            String str = br.readLine();
            char[] arr = str.toCharArray();
            char pre =' ';
            for(int j=0;j<arr.length;j++){
                if(!map.containsKey(arr[j])){
                    pre = arr[j];
                    map.put(pre,1);
                }else if(map.containsKey(arr[j])&&pre!=arr[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }

        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}