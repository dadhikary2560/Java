package Random;

import java.util.Scanner;

//Print a pyramid pattern of numbers.
public class PyramidPatternNumbers {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int maxLine=sc.nextInt();
		for(int i=1;i<=maxLine;i++)
		{
			for(int space=maxLine;space>i;space--)
			{
				System.out.print(" ");
			}
			for(int numIncr=1;numIncr<=i;numIncr++)
			{
					System.out.print(numIncr);
			}
			for(int numDecr=i-1;numDecr>=1;numDecr--)
			{
				System.out.print(numDecr);
			}
			System.out.println();
		}
	}
}
}
