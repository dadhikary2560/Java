package Random;
import java.util.Scanner;

//Calculate the sum of first n natural numbers.
public class SumOFnNaturalNumber {

	protected static void method1(int x) 
	{
		int sum=(x*(x+1))/2;
		System.out.println("sum of first "+x+" natural numbers is: "+sum);
	}
	
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("eneter first N numbers");
			int n=sc.nextInt();
			
			SumOFnNaturalNumber.method1(n); //sending n to method method1
		}
	}
}
