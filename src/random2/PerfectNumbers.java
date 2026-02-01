package random2;

//Print all Perfect numbers between 1 and 1000.
public class PerfectNumbers {
public static void main(String[] args) {
	for(int i=1;i<=1000;i++)
	{
		int sum=0;
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
				sum=sum+j;
		}
		if(sum==i)
			System.out.println("number is perfect number: "+i);
	}
}
}
