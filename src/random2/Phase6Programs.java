package random2;

import java.util.Scanner;

public class Phase6Programs {
	//Find and print the sum of the first n natural numbers.
	private void sumOfNnaturalNumbers(int a) {
		int sum=0;
		for(int i=1;i<=a;i++)
			sum=sum+i;
		System.out.println("Sum of all N natural numbers: "+sum);
	}
	//Find and print the sum of the first n even numbers.
	private void sumOfNEvenNumbers(int a) {
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
				sum=sum+i;
		}
		System.out.println("Sum of all N even numbers: "+sum);
	}
	//Print the first n terms of an arithmetic progression
	//for the given first term and common difference.
	private void arithmaticProgrssion(int terms) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first term and common difference");
		int first=sc.nextInt();
		int diff=sc.nextInt();
		
		geomatricProgression(first, diff, terms);
		//method calling from another method
		System.out.println();
		
		for(int i=1;i<=terms;i++)
		{
			System.out.print(first+" ");
			first=first+diff;
		}
		sc.close();
	}
	//Print the first n terms of a geometric progression 
	//for the given first term and common ratio.
	private void geomatricProgression(int firstNum, int ratio, int terms) {
		for(int i=1;i<=terms;i++)
		{
			System.out.print(firstNum+" ");
			firstNum=firstNum*ratio;
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last term for fibonacci series");
		int last=sc.nextInt();
		sumOfFibonacciSeries(last);
		sc.close();
	}
	//Find and print the sum of the Fibonacci series 
	//up to the required number of terms.
	private void sumOfFibonacciSeries(int n) {
		int a=0, b=1;
		int sum=0, seriesSum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			seriesSum=seriesSum+a;
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println("Sum of the fibonacci series: "+seriesSum);
	}
	//Calculate and print the value of the series 1² + 2² + 3² + … + n².
	private void seriesSum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last number for the series");
		int last=sc.nextInt();
		int sum=0;
		for(int i=1;i<=last;i++)
		{
			sum=(int) (sum+Math.pow(i, 2));
		}
		System.out.println("sum of the series 1² + 2² + 3² + … + n² is: "+sum);
		seriesSum2();
		sc.close();
	}
	//1 + 1/2 + 1/3 + … + 1/n.
	private void seriesSum2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last number for the series");
		int last=sc.nextInt();
		float sum=0;
		for(int i=1;i<=last;i++)
		{
			sum=sum+(1.0f/i);
		}
		System.out.println("sum of the series 1 + 1/2 + 1/3 + … + 1/n is: "+sum);
		sc.close();
	}
	//1! + 2! + 3! + … + n!.
	private void factorialSeries() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the last number for the series");
		int last=sc.nextInt();
		int sum=0;
		for(int i=1;i<=last;i++)
		{
			int factorial=1;
			for(int j=1;j<=i;j++)
				{
					factorial=factorial*j;
				}
			sum=sum+factorial;
		}
		System.out.println("sum of the series 1! + 2! + 3! + … + n! is: "+sum);
		sc.close();
	}
	// 1 + x + x² + x³ + … + xⁿ
	private void seriesSum3() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value for x and n");
	int x=sc.nextInt();
	int n=sc.nextInt();
	sc.close();
	int sum=0;
	for(int i=0;i<=n;i++)
		sum=(int) (sum+Math.pow(x, i));
	System.out.println("sum of the series is: "+sum);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Phase6Programs obj=new Phase6Programs();
		System.out.println("enter choice");
		int choice=sc.nextInt();
		
		if(choice==1)
		{	
			System.out.println("please enter last number");
			int n=sc.nextInt();
			obj.sumOfNnaturalNumbers(n);
		}
		if(choice==2)
		{	
			System.out.println("please enter last number");
			int n=sc.nextInt();
			obj.sumOfNEvenNumbers(n);
		}
		if(choice==3)
		{	
			System.out.println("please enter number of terms");
			int n=sc.nextInt();
			obj.arithmaticProgrssion(n);
		}
		if(choice==4)
			obj.seriesSum();
		if(choice==5)
			obj.factorialSeries();
		if(choice==6)
			obj.seriesSum3();
		sc.close();
	}
}
