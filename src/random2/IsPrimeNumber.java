package random2;
import java.util.Scanner;

public class IsPrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
	boolean isPrime=true;
	if(n<2)
		isPrime=false;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			isPrime=false;
			break;
		}
	}
	if(isPrime==true)
	System.out.println("prime number is: "+n);
}
}
