import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String num_st = Integer.toString(num);
        char[] arr=num_st.toCharArray();

        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println();
        scanner.close();
    }
}