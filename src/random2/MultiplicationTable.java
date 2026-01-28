package random2;

import java.util.Scanner;

//Print all possible pairs (i, j) where both i and j range from 1 to n.
//Print the multiplication tables for all numbers from 1 to 10.
public class MultiplicationTable {
	
	private void possiblePairs(int a) {
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
				System.out.print("("+i+", "+j+")"+" ");
		}

	}
	private void multiplicationTable() {
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+" x "+j+" = "+i*j);
			}
		}

	}
	//For every number from 1 to n, count and print the total 
	//number of its factors.
	private void factorCount(int n) {
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					System.out.println("value of j: "+j);
					count++;	
				}
			}
			System.out.println("factors count for: "+i+" is: "+count);
		}
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("press 1 for mulplication table and 2 for pairs");
	System.out.println("press 3 for factor count");
	int choice=sc.nextInt();
	MultiplicationTable obj=new MultiplicationTable();
	if(choice==1)
		obj.multiplicationTable();
	else if(choice==2)
	{
		System.out.println("enter last digit");
		int n=sc.nextInt();
		obj.possiblePairs(n);
	}
	else if(choice==3)
	{
		System.out.println("enter last digit");
		int last=sc.nextInt();
		obj.factorCount(last);
		
	}
	else
		System.out.println("wrong input");
	sc.close();
}
}