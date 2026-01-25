package Random;

import java.util.Scanner;

public class SumOfFibonacciSeries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=0, b=1, sum=0;
	for(int i=0;i<n;i++)
	{
		int add=a+b;		//so that everytime add starts with a new value
		System.out.print(a+" ");
		sum=sum+a;
		a=b;
		b=add;
	}
	System.out.println();
	System.out.print("sum of the fibonacci series: "+sum);
	sc.close();
}
}
