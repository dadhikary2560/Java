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
	System.out.println("value of n: "+n);
	
	//convert n to a string now, if n ranges between -100 and 100
	if(n>=-100 && n<=100)
	{
		String s=String.valueOf(n);
		System.out.println(s);
	}
}
}
