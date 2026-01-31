package random2;

import java.util.Scanner;

//Check whether the given number is a Strong number, 
//where the number equals the sum of factorials of its digits.
public class StrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number to be checked");
	int num=sc.nextInt();
	sc.close();
	int rem=0;
	int org=num;
	int sum=0;
	while(num>0)
	{
		int factorial=1;
		rem=num%10;
		for(int i=1;i<=rem;i++)
			factorial=factorial*i;
		sum=sum+factorial;
		num=num/10;
	}
	if(sum==org)
		System.out.println("number is Strong: "+org);
}
}
