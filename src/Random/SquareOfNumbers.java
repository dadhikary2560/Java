package Random;

import java.util.Scanner;

//Print the square of each number from 1 to n.
public class SquareOfNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		int pow=(int) Math.pow(i, 2);
		System.out.println("square value of "+i+" is:"+pow);
	}
	sc.close();
}
}
