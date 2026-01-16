package Random;

import java.util.Scanner;

//Print a square pattern of * with n rows and columns.
public class SquarePattern {
	private static void myMethod(int size) 
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print("* ");
			}
		System.out.println();	
		}
	}
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter row numbers");
		int row=sc.nextInt();
		SquarePattern.myMethod(row);
	}
}
}
