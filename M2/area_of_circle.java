import java.util.Scanner;
public class area_of_circle{
    static double pi(){
		return 3.14;
	}
	static double area(double radius){
		
		return pi() * radius * radius;
	}
    

	public static void main(String[] args){
		double radius;
		Scanner scan = new Scanner(System.in);
		radius = scan.nextDouble();
		System.out.println(area(radius));
	}
}