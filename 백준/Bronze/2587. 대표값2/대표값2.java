import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size=5;
        int[] arr = new int[size];

        int count=0;

        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
            count+=arr[i];
        }

        for(int i=0;i<size-1;i++){
            for(int j=size-1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        System.out.println(count/5);
        System.out.println(arr[2]);

        scanner.close();
    }
}