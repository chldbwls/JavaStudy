import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        String bomb = br.readLine();
        int bombLength = bomb.length();
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : input.toCharArray()) {
            stack.push(c);
            
            if (stack.size() >= bombLength) {
                boolean isMatch = true;
                for (int i = 0; i < bombLength; i++) {
                    if (stack.get(stack.size() - bombLength + i) != bomb.charAt(i)) {
                        isMatch = false;
                        break;
                    }
                }
                if (isMatch) {
                    for (int i = 0; i < bombLength; i++) {
                        stack.pop();
                    }
                }
            }
        }
        
        if (stack.isEmpty()) {
            bw.write("FRULA\n");
        } else {
            StringBuilder result = new StringBuilder();
            for (char c : stack) {
                result.append(c);
            }
            bw.write(result.toString() + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
