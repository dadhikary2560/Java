package random2;


//Print a matrix, then calculate and display the sum of each row 
//and the sum of each column.
public class MatrixCOLUMNAddition {
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		int sum=0;
		for(int j=1;j<=5;j++)
		{
			System.out.print(j);
			sum=sum+i;
		}
		System.out.println("for 1st column sum is:"+" "+sum);
		System.out.println();
	}
}
}
