package random2;
import java.util.Scanner;

//Print all Pythagorean triplets whose values are less than or equal to n.
public class PythagoreanTriplets {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=n;j++)
		{
			for(int k=j;k<=n;k++)
			{
				int a=i*i, b=j*j , c=k*k;				
				if(a+b==c)
					System.out.println(i+" "+j+" "+k);
			}
		}
	}
}
}
