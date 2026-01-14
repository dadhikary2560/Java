package Random;

import java.util.Scanner;

public class MultiplicationTable {
private void multiplication(int n) 
{
	for(int i=1;i<=10;i++)
	{
		int mul=n*i;
		System.out.println(n+" X "+i+" = "+mul);
	}

}
public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("enter the number for which you want multiplication table");
		int n=sc.nextInt();
		
		MultiplicationTable obj=new MultiplicationTable();
		obj.multiplication(n);
	}
}
}
