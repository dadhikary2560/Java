package Random;

import java.util.Scanner;

public class UntillNegativeNumberEntered {
	private void myMethod() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(true)
		{	
			int num=sc.nextInt();
			if(num>0)
			count++;
			if(num<0)
				break;
		}
		System.out.println(count);
	}
	
public static void main(String[] args) {
	int num=0;
	for(int line=1;line<=3;line++)
	{
		num=line;
		for(int star=1;star<=line;star++)
		{
			System.out.print(num);
			num++;
		}
		
		System.out.println();
	}
	UntillNegativeNumberEntered obj=new UntillNegativeNumberEntered();
	obj.myMethod();
}
}
