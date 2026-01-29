package random2;



public class FibonacciPattern {
public static void main(String[] args) {
	int a=0, b=1;
	int sum=0;
	for(int i=1;i<=8;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.println();
	}
}
}
