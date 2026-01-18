package Random;

import java.util.Scanner;

//Keep taking numbers from the user until 0 is entered, 
//then print the sum of all entered numbers.

public class KeepTakingNumberUntiluserHit0 {
public static void main(String[] args) {
	int largest=0, sum=0;
	boolean isZero=false;
	Scanner sc=new Scanner(System.in);
	while(isZero==false)
	{
		int num=sc.nextInt();
		sum=sum+num;
		if(largest<num)
		{
			largest=num;
		}
		else if(num==0)
		{
			isZero=true;
			break;
		}
	}
	System.out.println("sum of all the numbers entered by user: "+sum);
	System.out.println("largest among entered numbers: "+largest);
	sc.close();
	
	//-------------------------------------------------
	//Program to take input from user until user hit zero {0}
	/*int sum=0;
	boolean isZero=false;
	Scanner sc=new Scanner(System.in);
	while(isZero==false)
	{
		int num=sc.nextInt();
		sum=sum+num;
		if(num==0)
		{
			isZero=true;
			break;
		}
	}
	System.out.println(sum);
	sc.close();
	*/
	//--------------------------------------------------
}		
}
