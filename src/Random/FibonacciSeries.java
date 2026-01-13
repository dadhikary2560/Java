package Random;


//Print the first n Fibonacci numbers.
public class FibonacciSeries {
public static void main(String[] args) {
	int a=0, b=1;
	
	for(int i=1;i<=7;i++)
	{
		int sum=a+b;
		System.out.print(a+" ");
		a=b;
		b=sum;
	}
}
}
