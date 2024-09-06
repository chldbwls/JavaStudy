import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        //StringBuilder를 통해서 한번에 출력할 수있는 문자를 만듭니다.
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            sb.append(arr[i] +"\n");
        }
        
        System.out.println(sb.toString().trim());
    }
}