import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int[][] person = new int[size][2];
        int[][] win = new int[size][2];
        
        for(int i=0;i<size;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            person[i][0]=Integer.parseInt(st.nextToken());
            person[i][1]=Integer.parseInt(st.nextToken());
            win[i][0]=i;
        }

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(person[i][0]+(person[i][1]*person[j][0])>person[j][0]+(person[j][1]*person[i][0])){
                    win[i][1]+=1;
                }else{
                    win[j][1]+=1;
                }
            }
        }
        
        Arrays.sort(win, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[1], o1[1]);
            }
        });

        for(int i=0;i<size;i++){
            bw.write(win[i][0]+1+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}