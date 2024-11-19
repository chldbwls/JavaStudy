

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr= new int[N][2];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,(a,b)->{
            if(a[1]==b[1]){
                return Integer.compare(a[0], b[0]);
            }else{
                return Integer.compare(a[1], b[1]);
            }
        });
        int count = 0;
        int last = 0;
        for(int[] a: arr){ 
            if(a[0]>=last){   //회의 시작 시간이 마지막 회의가 끝나는 시간보다 늦은 시간이면 
                last=a[1];   //해당 회의가 끝나는 시간을 마지막 회의가 끝나는 시간으로 설정 
                count++;   //그 회의 가능 
            }
        }

        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
