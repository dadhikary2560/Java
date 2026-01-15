package Random;

import java.util.Scanner;

//Print a hollow square pattern using *.
public class HollowSquare {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int maxLine=sc.nextInt();
	for(int i=1;i<=maxLine;i++)
	{
		if(i==1 || i==maxLine)
		{
			for(int j=1;j<=maxLine;j++)
				System.out.print("* ");
		}
		else
			{
				System.out.print("* ");
				for(int k=2;k<maxLine;k++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
			}
		System.out.println();
	}
	sc.close();
}
}
