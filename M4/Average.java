import java.util.*;
public class Average{
	public static void main(String args[]){
		System.out.println("enter size of array:");
		int arr[];
		double avg=0,sum=0;
		int size = new Scanner(System.in).nextInt();
		arr = new int[size];
		System.out.println("Elements are:");
		 for(int i=0;i<arr.length;i++){

     	arr[i]=new Scanner(System.in).nextInt();
     	sum = sum + arr[i];
     }
     System.out.println("Average is :"+(sum/size));


	}
}