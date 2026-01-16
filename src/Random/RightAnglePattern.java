package Random;

import java.util.Scanner;

//Print a right-angled triangle pattern of *.
public class RightAnglePattern {
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter last line");
		int line=sc.nextInt();
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
}
