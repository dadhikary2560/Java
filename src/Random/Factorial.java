package Random;

import java.util.Scanner;


public class Factorial {
	private static int myMethod(int num) {
		int fact=1;
		for(int i=num;i>=1;i--)
			fact=fact*i;
		return fact;

	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=Factorial.myMethod(x);
	System.out.println("Factorial value is: "+y);
	sc.close();
}
}
