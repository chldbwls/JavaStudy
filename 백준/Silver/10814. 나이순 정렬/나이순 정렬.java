import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        String[][] mem = new String[size][2];

        for(int i=0;i<size;i++){
            String input = scanner.nextLine();
            String[] part= input.split(" ",2);
            mem[i][0]=part[0];
            mem[i][1]=part[1];
        }

        Arrays.sort(mem, (a,b)-> {
            if(!a[0].equals(b[0])){ //나이가 다르면 나이순으로 비교    
                return Integer.compare(Integer.parseInt(a[0]),Integer.parseInt(b[0]));
            }else{  //나이가 같으면 그냥 입력순 
                return 0;
            }
        });

        for(int i=0;i<size;i++){
            System.out.println(mem[i][0]+" "+mem[i][1]);
        }
        scanner.close();
    }
}