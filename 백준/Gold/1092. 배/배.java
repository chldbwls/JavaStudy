import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int K = Integer.parseInt(br.readLine());
        List<Integer> box = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < K; i++) {
            box.add(Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr, Collections.reverseOrder());
        box.sort(Collections.reverseOrder());

        if (box.get(0) > arr[0]) {
            bw.write("-1\n");
            bw.flush();
            return;
        }

        int count = 0;
        while (!box.isEmpty()) {
            ListIterator<Integer> iter = box.listIterator();
            for (int i = 0; i < N; i++) {
                while (iter.hasNext()) {
                    if (arr[i] >= iter.next()) {
                        iter.remove();
                        break;
                    }
                }
            }
            count++;
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
