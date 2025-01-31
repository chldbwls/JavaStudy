

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> plus = new ArrayList<>();
        ArrayList<Integer> minus = new ArrayList<>();
        int OneCount = 0;
        int ZeroCount = 0;
        for(int i=0;i<N;i++){
            int input = Integer.parseInt(br.readLine());
            if(input>1){
                plus.add(input);
            }else if(input<0){
                minus.add(input);
            }else if(input==0){
                ZeroCount++;
            }else if(input==1){
                OneCount++;
            }
        }

        Collections.sort(plus,Collections.reverseOrder());
        Collections.sort(minus);

        int sum = OneCount;
        for(int i=0;i<plus.size();i+=2){
            if(i+1<plus.size()){
                sum+=plus.get(i)*plus.get(i+1);
            }else{
                sum+=plus.get(i);
            }
        }

        for(int i=0;i<minus.size();i+=2){
            if(i+1<minus.size()){
                sum+=minus.get(i)*minus.get(i+1);
            }else{
                if(ZeroCount==0){
                    sum+=minus.get(i);
                }
            }
        }

        bw.write(sum+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
