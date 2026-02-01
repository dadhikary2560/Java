package random2;

import java.util.Scanner;

//Find the number between 1 and n that has the maximum 
//digit sum, and print that number along with its digit sum.
public class MaxSumDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the last digit");
	int n=sc.nextInt();
	sc.close();
	int maxSum=0;
	int numberWithMaxSum=0;
	for(int i=1;i<=n;i++)
	{
		int num=i;
		int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(sum>maxSum)
		{
			maxSum=sum;
			numberWithMaxSum=i;
			
		}
	}
	System.out.println("maxSum and value at where we have received it");
	System.out.println(maxSum+" "+numberWithMaxSum);
}
}
