package Random;

import java.util.Scanner;

//Print a hollow pyramid pattern using numbers or *.
public class HollowPyramid {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int line=sc.nextInt();
	
	for(int i=1;i<=line;i++)
	{
		for(int space=line;space>i;space--)
		{
			System.out.print(" ");
		}
		if(i==1 || i==line)
		{
			for(int ast1=1;ast1<=i;ast1++)
			{
				System.out.print("* ");
			}
		}
		else
			{
				System.out.print("*");
				for(int spaceIn=1;spaceIn<2*i-2;spaceIn++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
		System.out.println();
	}
	sc.close();
}
}
