import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> answer = new ArrayList<>();
        String input;
        while(!((input=br.readLine()).equals("."))){
            Stack<Character> stackList = new Stack<>();
            boolean valid = true;
            for(char ch : input.toCharArray()){
                if(ch=='(' || ch=='['){
                    stackList.push(ch);
                }else if(ch==')'){
                    if(stackList.isEmpty() || stackList.peek() != '('){
                        valid = false;
                        break;
                    }
                    stackList.pop();
                }else if(ch==']'){
                    if(stackList.isEmpty() || stackList.peek() != '['){
                        valid = false;
                        break;
                    }
                    stackList.pop();
                }
            }
            // If stack is not empty, it means there are unmatched opening brackets
            if(!stackList.isEmpty()){
                valid = false;
            }

            if(valid){
                answer.add("yes");
            }else{
                answer.add("no");
            }
        }
        
        for(String str : answer){
            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}