

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        bw.write(avg(arr, N) + "\n");
        bw.write(arr[N / 2] + "\n");
        bw.write(many(arr, N) + "\n");
        bw.write(arr[N - 1] - arr[0] + "\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int avg(int[] arr, int N) {
        int result = 0;
        for (int i = 0; i < N; i++) {
            result += arr[i];
        }
        return (int)Math.round((double)result/N);
    }

    public static int many(int[] arr, int N) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = Collections.max(map.values());
        List<Integer> modes = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                modes.add(entry.getKey());
            }
        }

        if (modes.size() > 1) {
            Collections.sort(modes);  
            return modes.get(1);      
        } else {
            return modes.get(0);      
        }
    }
}
