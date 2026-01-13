package Random;


//Print numbers from 1 to 10.

public class PrintNumbers1to10 {
	private static void methodToPrint1to10() {
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		PrintNumbers1to10.methodToPrint1to10();
		
		//if we declare method as static then we can directly call with class name
		//no need to create object
	}
}
