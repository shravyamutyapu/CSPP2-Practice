import java.util.Scanner;
public class factorial{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(fact(num));

	}
	static int fact(int num){
		
		if(num==0){
			return 1;
		}
		else{
			return num*fact(num-1);
		}

	}
}