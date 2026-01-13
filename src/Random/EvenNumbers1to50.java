package Random;

import java.util.Scanner;
//Print all even numbers from 1 to 50.
public class EvenNumbers1to50 {
	private void method1(int y) 
	{
		System.out.println("even numbers are: ");
		for(int i=1;i<=y;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}

	}
	public static void main(String[] args) {
	EvenNumbers1to50 m1=new EvenNumbers1to50();
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter last number");
		int x=sc.nextInt();
		m1.method1(x);
	}
	
}
}
