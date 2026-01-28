package random2;

import java.util.Scanner;

//7. Calculate and print the factorial of every number from 1 to n.
public class FactorialOfEachNumberFrom1toN {
	private void myMethod(int last) {
		
		for(int i=1;i<=last;i++)
		{
			int factorial=1;
			for(int j=1;j<=i;j++)
				factorial=factorial*j;
			System.out.println("factorial of "+i+" is "+factorial);
		}
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the last number");
	int n=sc.nextInt();
	FactorialOfEachNumberFrom1toN obj=new FactorialOfEachNumberFrom1toN();
	obj.myMethod(n);
	sc.close();
}
}
