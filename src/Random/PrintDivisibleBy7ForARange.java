package Random;

import java.util.Scanner;

//Print all numbers between a and b that are divisible by 7.
public class PrintDivisibleBy7ForARange {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("initialize starting point");
	int start=sc.nextInt();
	System.out.println("write the ending point");
	int end=sc.nextInt();
	for(int i=start;i<=end;i++)
	{
		if(i%7==0)
			System.out.print(i+" ");
	}
	sc.close();
}
}
