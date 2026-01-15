package Random;

import java.util.Scanner;

//Print a number triangle pattern:
public class NumberTrianglePattern {
private void myMethod(int lines) {
	for(int i=1;i<=lines;i++)
	{
		for(int num=1;num<=i;num++)
		{
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int maxLine=sc.nextInt();
		NumberTrianglePattern obj=new NumberTrianglePattern();
		obj.myMethod(maxLine);
	}
}
}
