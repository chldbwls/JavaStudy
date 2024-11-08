import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int word = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < word; i++) {
            String str = br.readLine();
            if (str.length() >= limit) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Comparator
                .comparing(Map.Entry<String, Integer>::getValue, Comparator.reverseOrder())
                .thenComparing((entry1, entry2) -> Integer.compare(entry2.getKey().length(), entry1.getKey().length()))
                .thenComparing(Map.Entry::getKey));

        for (Map.Entry<String, Integer> entry : list) {
            bw.write(entry.getKey() + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}