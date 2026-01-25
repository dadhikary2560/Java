package Random;

import java.util.Scanner;

//Count and print the number of digits in the given number.
public class HowManyDigits {
	private void myMethod(int numberReceived) {
		int count=0;
		while(numberReceived>0)
		{
			count++;
			numberReceived=numberReceived/10;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	HowManyDigits obj=new HowManyDigits();
	obj.myMethod(num);
	sc.close();
}
}
