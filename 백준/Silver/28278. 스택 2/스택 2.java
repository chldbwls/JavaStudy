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
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a==1){
                int input = Integer.parseInt(st.nextToken());
                stackList.add(input);
                top++;
            }else if(a==2){
                if(top!=-1){
                    bw.write(Integer.toString(stackList.get(top))+"\n");
                    stackList.remove(top--);
                }else{
                    bw.write(-1+"\n");
                }
            }else if(a==3){
                bw.write(top+1+"\n");
            }else if(a==4){
                if(top==-1){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            }else if(a==5){
                if(top!=-1){
                    bw.write(Integer.toString(stackList.get(top))+"\n");
                }else{
                    bw.write(-1+"\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}