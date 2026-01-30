package random2;



//8. Print all prime numbers between 1 and 100.
public class Prime1to100 {
public static void main(String[] args) {
	
	for(int i=1;i<=100;i++)
	{
		boolean prime=true;
		if(i<2)
			continue;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				prime=false;
				break;
			}
			
		}
		if(prime==true)
		System.out.print(i+" ");
	}
}
}
