package Random;

public class Prime1to100 {
public static void main(String[] args) {
	System.out.println("prime numbers are: ");
	for(int num=1;num<=100;num++)
	{
		boolean isPrime=true;
		if(num<=1)
			continue;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime==true)
		{
			System.out.print(num+" ");
		}
	}

}
}
