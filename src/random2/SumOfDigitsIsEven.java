package random2;


//between 1 and 100 whose sum of digits is even.
public class SumOfDigitsIsEven {
public static void main(String[] args) {
	
	for(int i=1;i<=100;i++)
	{
		int num=i;
		int rem=0, sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(sum%2==0)
		{
			System.out.print(i+" ");
		}
	}
}
}
