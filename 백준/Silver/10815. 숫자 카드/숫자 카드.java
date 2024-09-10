import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size1 = Integer.parseInt(br.readLine());
        int[] arr = new int[size1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<size1;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<size1;i++){
            map.put(arr[i],1);
        }

        int size2 = Integer.parseInt(br.readLine());
        int[] check = new int[size2];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<size2;i++){
            check[i]=Integer.parseInt(st2.nextToken());
        }

        for(int num:check){
            if(map.containsKey(num)){
                bw.write("1 ");
            }else{
                bw.write("0 ");
            }
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}