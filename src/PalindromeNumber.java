
public class PalindromeNumber {
public static void main(String[] args) {
	int n=12321;
	int check=n;
	int newNumber=0;
	int remainder=0;
	while(n!=0)
	{
		remainder=n%10;	//12321%10=1		2		3
		n=n/10;			//12321/10=1232		123		12
		newNumber=newNumber*10+remainder; //newNum=0*10+remainder=1		1*10+2		12*10+3
		System.out.print(newNumber+" ");
	}
	System.out.println();
	
	
	System.out.println(newNumber); //12321
	if(newNumber==check)
	{
		System.out.println("palindrome");
	}
}
}
