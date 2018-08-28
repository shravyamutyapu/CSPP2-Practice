import java.util.Scanner;
public class big_small_equal{
	public static void main(String[] args){
		int a;
		int b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		if(a<b)System.out.println("Smaller");
		else if(a>b)System.out.println("Bigger");
		else System.out.println("Equal");
		
	}
}