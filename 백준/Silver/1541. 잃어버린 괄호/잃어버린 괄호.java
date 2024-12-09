

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] token = input.split("(?=[+-])|(?<=[+-])");
        int total = 0;
        boolean flag = true;
        for(int i=0;i<token.length;i++){
            if(token[i].equals("-")){
                flag = false;
            }
            if(!token[i].equals("+")&&!token[i].equals("-")){
                if(flag){
                    total+=Integer.parseInt(token[i]);
                }else{
                    total-=Integer.parseInt(token[i]);
                }
            }
        }

        bw.write(total+"\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
