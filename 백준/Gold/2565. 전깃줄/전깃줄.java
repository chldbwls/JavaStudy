
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a,b)-> Integer.compare(a[0], b[0]));
        int[] arr2 = new int[N];
        for(int i=0;i<N;i++){
            arr2[i]=arr[i][1];
        }
        bw.write(N-LIS(arr2)+"\n");
        

        bw.flush();
        bw.close();
        br.close();
    }

    public static int LIS(int[] arr){
        List<Integer> li = new ArrayList<>();
        for(int num:arr){
            int pos = Collections.binarySearch(li, num);
            if(pos<0){
                pos=-(pos+1);
            }
            if(pos<li.size()){
                li.set(pos,num);
            }else{
                li.add(num);
            }
        }
        return li.size();
    }
}
