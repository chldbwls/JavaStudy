

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int[]> stack = new Stack<>();
        int result[] = new int[N];
        for(int i=0;i<N;i++){
            int height = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty()&&stack.peek()[0]<height){
                stack.pop();
            }

            if(stack.isEmpty()){
                result[i]=0;
            }else{
                result[i]=stack.peek()[1]+1;
            }

            stack.push(new int[]{height,i});
        }

        for(int i=0;i<N;i++){
            bw.write(result[i]+" ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
