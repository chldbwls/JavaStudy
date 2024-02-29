import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = 0;
	int b = 0;

	a = sc.nextInt();
	b = sc.nextInt();
	int c = 0;
	c = a + b;
	System.out.print(c);
	sc.close();
	}
}