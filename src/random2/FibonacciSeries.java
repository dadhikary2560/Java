package random2;

import java.util.Scanner;



//10. Print the Fibonacci series up to the required number of terms.
public class FibonacciSeries {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum;
	int start=0, next=1;
	
	sc.close();
	for(int i=1;i<=num;i++)
	{
		sum=start+next;
		System.out.print(start+" ");
		start=next;
		next=sum;
	}
}
}
