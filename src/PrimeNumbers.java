import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int prime1=sc.nextInt();
	int flag=0;
	for(int i=2;i<prime1;)
	{
		if(prime1%i==0)
		{
			flag=1;
			break;
		}
		i++;
	}
	if(flag==1)
	{
		System.out.println("number is not prime "+prime1);
	}
	else
		System.out.println("number is prime "+prime1);
	
	sc.close();
	
}
}
