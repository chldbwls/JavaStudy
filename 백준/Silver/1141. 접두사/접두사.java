import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String[] arr = new String[size];
        for(int i=0;i<size;i++){
            arr[i]=br.readLine();
        }

        int total=0;
        Arrays.sort(arr);
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=i+1;j<size;j++){
                if(arr[j].startsWith(arr[i])){
                    count++;
                }
            }
            if(count==0){
                total++;
            }
        }
        if(total==0&&size==0){
            bw.write(0+"\n");
        }else if(total==0){
            bw.write(1+"\n");
        }else{
            bw.write(total+"\n");
        }

        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}