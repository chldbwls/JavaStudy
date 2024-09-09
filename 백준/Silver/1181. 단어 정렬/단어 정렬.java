import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] str= new String[size];

        for(int i=0;i<size;i++){
            str[i]=scanner.nextLine();
        }

        Arrays.sort(str, (a,b)-> {
            if(a.length()!=b.length()){
                return Integer.compare(a.length(),b.length());
            } else{
                return a.compareTo(b);
            }
        });

        System.out.println(str[0]);
        for(int i=1;i<str.length;i++){
            if(str[i].equals(str[i-1])!=true){
                System.out.println(str[i]);
            }
        }
        scanner.close();
    }
}