package random2;

//between 1 & 500 are divisible by 7 but not divisible by 5.
public class NumberDivisibleby7notBy5 {
	
	//palindrome numbers between 1 and 500.
	private void palindromeNumbers() {
		System.out.println("palindrome numbers are: ");
		for(int i=1;i<=500;i++)
		{
			int num=i;
			int rem=0, sum=0;
			while(num>0)
			{
				rem=num%10;
				sum=sum*10+rem;
				num=num/10;
			}
			if(sum==i)
				System.out.print(i+" ");
		}
	}
	
public static void main(String[] args) {
	for(int i=1;i<=500;i++)
	{
		if(i%7==0 && i%5!=0)
			System.out.print(i+" ");
	}
	NumberDivisibleby7notBy5 obj=new NumberDivisibleby7notBy5();
	obj.palindromeNumbers();
}
}
