import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int now = Integer.parseInt(st.nextToken());
        int tae = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        
        if(now==0){
            bw.write(1+"\n");
        }else{
            int[] score = new int[now];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int i=0;i<now;i++){
                score[i]=Integer.parseInt(st2.nextToken());
            }
            Arrays.sort(score);

            if(now==total){
                if(score[0]>=tae){
                    bw.write(-1+"\n");
                }else{
                    int index = find(score,now,tae);
                    bw.write((now-index)+"\n");
                }
            }else{
                if(score[0]>tae){
                    bw.write((now+1)+"\n");
                }else{
                    int index = find(score,now,tae);
                    bw.write((now-index)+"\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int find(int[] arr, int now, int tae){
        for(int i=0;i<now-1;i++){
            if(tae<arr[i+1]){
                return i;
            }
        }
        return now-1;
    }
}