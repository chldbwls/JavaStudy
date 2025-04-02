import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
 
        PriorityQueue<Integer> queue = new PriorityQueue<>( (o1, o2) -> o2 - o1 );
        String [] temp;
        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < temp.length; j++) {
                queue.add(Integer.parseInt(temp[j]));
            }
        }
        int answer = 0;
        int cnt = 0;
        while (cnt < n ){
            answer = queue.poll();
            cnt++;
        }
        System.out.println(answer);
 
    }
}