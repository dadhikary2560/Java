package Random;

public class SmallestDigit {
public static void main(String[] args) {
	int rem=0;
	int n=857;
	int smallest=n%10;
	while(n>0)
	{
		rem=n%10;
		if(smallest>rem)
		{
			smallest=rem;
		}
		n=n/10;
	}
	System.out.println(smallest);
	
}
}
