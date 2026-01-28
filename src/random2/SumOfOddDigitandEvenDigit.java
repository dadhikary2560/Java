package random2;

import java.util.Scanner;

//Calculate and print the sum of even digits and the sum of odd digits 
//of the given number separately
public class SumOfOddDigitandEvenDigit {

	private void myMethod(int num) {
		int remainder;
		int oddSum = 0, evenSum = 0;
		while(num>0)
		{
			remainder = num%10;
			if(remainder%2==0)
				evenSum=evenSum+remainder;
			else
				oddSum=oddSum+remainder;
			num=num/10;	
		}
		System.out.println("sum of all even digits: "+evenSum);
		System.out.println("sum of all odd digits: "+oddSum);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int x=sc.nextInt();
		sc.close();
		
		SumOfOddDigitandEvenDigit obj=new SumOfOddDigitandEvenDigit();
		obj.myMethod(x);
	}
}
