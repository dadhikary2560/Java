package Random;

import java.util.Scanner;

//Count how many numbers in an array are greater than 50.
public class ElementsGreaterThan50 {
private int m1(int arr2[]) {
	int count=0;			//count is of int data-type, so return type is int
	for(int i=0;i<arr2.length;i++)
	{
		if(arr2[i]>50)
			count++;
	}
	return count;	//returns count, to where method is being called

}
public static void main(String[] args) {
	System.out.println("enter size of array");
	try (Scanner sc = new Scanner(System.in)) {
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int arr[]=new int[n];
		
		
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		ElementsGreaterThan50 obj=new ElementsGreaterThan50();
		int stores=obj.m1(arr);		//whatever methods returns gets stored in 
		System.out.println("numbers greater than 50 is: "+stores);
	}
}
}
