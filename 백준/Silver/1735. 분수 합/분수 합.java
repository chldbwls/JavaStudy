
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a1=0 ,b1=0;
        int a2=0 ,b2=0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        a1 = Integer.parseInt(st.nextToken());
        b1= Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        a2 = Integer.parseInt(st2.nextToken());
        b2= Integer.parseInt(st2.nextToken());

        int top=0,bottom=0;
        bottom = b1*b2;
        top = (a1*b2)+(a2*b1);

        int big=0, small=0;
        if(top>bottom){
            big = top;
            small = bottom;
        }else{
            big = bottom;
            small = top;
        }

        int z=0;
        while(true){
            z=big%small;
            if(z==0){
                break;
            }
            big=small;
            small=z;
        }

        top=top/small;
        bottom=bottom/small;

        bw.write(top+" "+bottom+"\n");


        bw.flush();
        bw.close();
        br.close();
    }
}