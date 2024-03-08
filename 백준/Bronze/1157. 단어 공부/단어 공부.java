import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int[] check = new int[26];
        String a = scanner.nextLine();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=65&&a.charAt(i)<=90){
                check[a.charAt(i)-'A']++;
            }else{
                check[a.charAt(i)-'a']++;
            }
        }

        int max=0;
        char index=0;
        for(int i=0;i<26;i++){
            if(check[i]>max){
                max=check[i];
                index=(char)(i+65);
            }else if(check[i]==max){
                index='?';
            }
        }
        System.out.println(index);
        scanner.close();
	}
} 
