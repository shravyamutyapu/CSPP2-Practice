import java.util.*;
public class FirstLast6{
	public static void main(String args[]){
		System.out.println("enter size of array:");
		int size = new Scanner(System.in).nextInt();
		int arr[];
		arr = new int[size];
		System.out.println("elements are :");
     for(int i=0;i<arr.length;i++){

     	arr[i]=new Scanner(System.in).nextInt();
     }

     	if((arr[0]==6)||(arr[arr.length-1]==6)){
     	System.out.println("true"); 
     	}
     	else System.out.println("false");

	}
}