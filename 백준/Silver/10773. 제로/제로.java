import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> stackList = new ArrayList<>();
        int num = Integer.parseInt(br.readLine());
        int top=-1;
        for(int i=0;i<num;i++){
            int input = Integer.parseInt(br.readLine());
            if(input==0){
                stackList.remove(top--);
            }else{
                stackList.add(input);
                top++;
            }
        }

        int count =0;
        for(int i=0;i<stackList.size();i++){
            count = count + stackList.get(top--);
        }
        bw.write(count+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}