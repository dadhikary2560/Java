package random2;

import java.util.Scanner;

public class Phase5Programs {
	private void ifDivisibleby17() {
		for(int i=1;i<=100;i++)
		{
			if(i%17==0 && i!=17)
				break;
			System.out.print(i+" ");
		}
	}
	private void skipIfDivisibleby5() {
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
				continue;
			System.out.print(i+" ");
		}
	}
	//Take 5 numbers as input, skip any number that is 0 using continue, 
	//and calculate the sum of the remaining numbers.
	private void enter5NumbersifFound0Skip(int arrRcvd[]) {
		int sum=0;
		for(int i=0;i<arrRcvd.length;i++)
		{
			if(arrRcvd[i]==0)
				continue;
			sum=sum+arrRcvd[i];
		}
		System.out.println("sum of all non zero numbers: "+sum);
	}
	//Search for a specific number in a list of inputs, and terminate 
	//loop immediately when the number is found.
	private void ifNumberFoundTerminateLoop(int arrayRcvd[], int n) {
		for(int i=0;i<arrayRcvd.length;i++)
		{
			if(arrayRcvd[i]==n)
				break;
			System.out.print(arrayRcvd[i]+" ");
		}
	}
public static void main(String[] args) {
	Phase5Programs obj=new Phase5Programs();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter choice");
	int choice=sc.nextInt();
	
	if(choice==1)
		obj.ifDivisibleby17();
	if(choice==2)
		obj.skipIfDivisibleby5();
	if(choice==3)
	{
		System.out.println("enter 5 numbers");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		obj.enter5NumbersifFound0Skip(arr);
	}
	if(choice==4)
	{
		System.out.println("how many numbers you want as input");
		int arrLength=sc.nextInt();
		int arr[]=new int[arrLength];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("enter number that is to be searched");
		int num=sc.nextInt();
		obj.ifNumberFoundTerminateLoop(arr, num);
	}
	sc.close();
}
}
