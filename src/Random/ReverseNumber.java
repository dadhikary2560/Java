package Random;

import java.util.Scanner;


//Reverse the given number and print the reversed value.
public class ReverseNumber {
	
	
	//ReverseNumber
	private int myMethod(int number) 
	{
		int rem=0, reverse=0;
		while(number>0)
		{
			rem=number%10;
			reverse=reverse*10+rem;
			number=number/10;
		}
		return reverse;
	}
	
	//Armstrong number
	private void methodArmstrong(int number) 
	{
		int org=number;
		int count=0, remainder=0;
		while(number>0)
		{
			count++;
			number=number/10;
		}
		number=org;
		int sum=0;
		while(number>0)
		{
			remainder=number%10;
			sum=sum+(int)Math.pow(remainder, count);
			number=number/10;
		}
		if(sum==org)
		{
			System.out.println("Number is armstrong");
		}
		else
			System.out.println("Number is not armstrtong: "+org);
	}
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	
	
	ReverseNumber obj=new ReverseNumber();
	int reverseNumber=obj.myMethod(num);
	obj.methodArmstrong(num);
	
	System.out.println("reversed number is "+reverseNumber);
	sc.close();
	
}
}
