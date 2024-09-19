import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int num = Integer.parseInt(br.readLine());
        char[] arr = str.toCharArray();
        int count=0;
        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j=start;j<=end;j++){
                if(arr[j]==a){
                    count++;
                }
            }
            bw.write(count+"\n");
            count=0;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}