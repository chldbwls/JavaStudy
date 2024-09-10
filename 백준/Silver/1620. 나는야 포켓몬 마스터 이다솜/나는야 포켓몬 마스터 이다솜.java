import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        // 이름을 인덱스에 매핑하는 HashMap
        Map<String, Integer> nameToIndex = new HashMap<>();
        // 인덱스를 이름에 매핑하는 HashMap
        Map<Integer, String> indexToName = new HashMap<>();

        for (int i = 0; i < total; i++) {
            String name = br.readLine();
            nameToIndex.put(name, i + 1); // 이름 -> 인덱스
            indexToName.put(i + 1, name); // 인덱스 -> 이름
        }

        for (int i = 0; i < num; i++) {
            String query = br.readLine();
            try {
                // 숫자로 변환 시도
                int index = Integer.parseInt(query);
                // 인덱스를 이름으로 변환하여 출력
                bw.write(indexToName.get(index) + "\n");
            } catch (NumberFormatException e) {
                // 숫자가 아닌 경우 (이름으로 인식)
                bw.write(nameToIndex.get(query) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
