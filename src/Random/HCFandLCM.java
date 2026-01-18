package Random;

import java.util.Scanner;

public class HCFandLCM {
	private int methodHCF(int a, int b) {
		int hcf=0;
		for(int i=1;i<=a && i<=b;i++)
		{	
			if(a%i==0 && b%i==0)
			{
				hcf=i;
			}
		}
	return hcf;
	}
	private void methodLCM(int a, int b) {
		int hcf=methodHCF(a, b);
		System.out.println("HCF is: "+hcf);
		int lcm=(a*b)/hcf;
		System.out.println("LCF is: "+lcm);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first and second number");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	HCFandLCM obj1=new HCFandLCM();
	obj1.methodLCM(num1, num2);
	sc.close();
}
}
