package Random;

import java.util.Scanner;

//28. Find the smallest digit in the given number.
public class LargestDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rem=0;
	int large=0;
	while(num>0)
	{
		rem=num%10;
		if(rem>large)
			large=rem;
		num=num/10;
	}
	System.out.println(large);
	sc.close();
}
}
