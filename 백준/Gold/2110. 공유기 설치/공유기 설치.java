

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] home = new int[N];
        for(int i=0;i<N;i++){
            home[i]= Integer.parseInt(br.readLine());
        }

        Arrays.sort(home);
        int low = 1;
        int high = home[N-1]+home[0];
        int install = 0;

        while (low<=high) {
            int mid=(high+low)/2;
            if(a(home,N,C,mid)){
                install = mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        bw.write(install+"\n");

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean a (int[] home, int n, int c, int mid)
    {
        int count = 1;
        int last = home[0];
        for(int i=1;i<n;i++){
            if(home[i]-last>=mid){
                count++;
                last=home[i];
            }
            if(count>=c){
                return true;
            }
        }
        return false;
    }
}
