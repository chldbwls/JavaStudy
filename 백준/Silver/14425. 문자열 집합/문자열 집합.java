import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size1 = Integer.parseInt(st.nextToken());
        int size2 = Integer.parseInt(st.nextToken());

        String[] arr1 = new String[size1];
        String[] arr2 = new String[size2];

        for(int i=0;i<size1;i++){
            arr1[i]=br.readLine();
        }

        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<size1;i++){
            map.put(arr1[i],1);
        }

        for(int i=0;i<size2;i++){
            arr2[i]=br.readLine();
        }
        
        int count=0;
        for(String str:arr2){
            if(map.containsKey(str)){
                count++;
            }
        }

        bw.write(count+"\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}