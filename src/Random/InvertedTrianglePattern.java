package Random;

import java.util.Scanner;

//Print an inverted triangle pattern of *.
public class InvertedTrianglePattern {

	private static void myMethod(int lines) {
		for(int i=1;i<=lines;i++)
		{
			for(int j=lines;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter row numbers");
	int row=sc.nextInt();
	InvertedTrianglePattern.myMethod(row);
	sc.close();
}
}
