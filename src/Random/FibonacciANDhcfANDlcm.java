package Random;

import java.util.Scanner;

//10. Print the Fibonacci series up to the required number of terms.
//11. Find the HCF (Highest Common Factor) of the given numbers.
public class FibonacciANDhcfANDlcm {

	public void Fibonacci(int receivedN) {
		int a=0, b=1;
		for(int i=0;i<receivedN;i++)
		{
			int sum=a+b;
			System.out.print(a+" ");
			a=b;
			b=sum;
		}
	}
	private void hcf(int a, int b) {
		int hcf=0;
		for(int i=1;i<=a && i<=b;i++)
		{
				if(a%i==0 && b%i==0)
				hcf=i;
		}
		System.out.println("HCF of the two number is:"+hcf);
	}
	public void lcm(int a, int b) {
		int max = Math.max(a, b);
	    while (true) 
	    {
	        if (max % a == 0 && max % b == 0) {
	            System.out.println("LCM of the two numbers is: " + max);
	            break;
	        }
	        max=max+1;
	    }
	    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FibonacciANDhcfANDlcm obj=new FibonacciANDhcfANDlcm();
		
		//for fibonacci series
		System.out.println("enter the n th position for fibonacci series");
		int n=sc.nextInt();
		obj.Fibonacci(n);
		System.out.println();
		
		//for HCF
		System.out.println("enter the numbers for HCF");
		int hcf1=sc.nextInt();
		int hcf2=sc.nextInt();
		obj.hcf(hcf1, hcf2);
		
		//for LCM
		obj.lcm(hcf1, hcf2);
		
		//close Scanner
		sc.close();
		
	}
}
