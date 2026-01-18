package Random;

import java.util.Scanner;

//Print all factors of the given number.
public class AllFactors {
	public static void methodToPrintFactors(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}

	}
	public static void methodToPrintSumOfFactors(int add) 
	{
		int sum=0;
		for(int i=1;i<=add;i++)
		{
			if(add%i==0)
				sum=sum+i;
		}
		System.out.println("sum of all factors: "+sum);
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	AllFactors.methodToPrintFactors(n);
	AllFactors.methodToPrintSumOfFactors(n);
	sc.close();
}
}
