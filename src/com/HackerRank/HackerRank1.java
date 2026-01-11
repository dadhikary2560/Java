package com.HackerRank;

import java.util.Scanner;

/*
 * You are given an integer "n", you have to convert it into a string.
Please complete the partially completed code in the editor. If your code 
successfully converts "n" into a string "s" the code will print "Good job". 
Otherwise it will print "Wrong answer".
n can range between -100 to 100  inclusive.
 */
public class HackerRank1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s = null;
	System.out.println("value of n: "+n);
	
	//convert n to a string now, if n ranges between -100 and 100
	if(n>=-100 && n<=100)
	{
		s=String.valueOf(n);
		//The above line converts Integer 25 to String "25"
		System.out.println(s);
	}
	if(n==Integer.parseInt(s))
		//Integer.parseInt converts String "25" to Integer 25
		System.out.println("Good job");
	else
		System.out.println("Wrong Answer");
}
}
