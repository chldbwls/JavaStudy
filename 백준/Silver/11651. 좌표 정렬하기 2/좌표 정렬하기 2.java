import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] arr = new int[size][2];
        for(int i=0;i<size;i++){
            arr[i][0]=scanner.nextInt();
            arr[i][1]=scanner.nextInt();
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);  
            } else {
                return Integer.compare(a[1], b[1]);  
            }
        });

        for(int i=0;i<size;i++){
            System.out.println(arr[i][0] +" "+ arr[i][1]);
        }
        scanner.close();
    }
}