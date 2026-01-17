package Random;

public class PerfectNumber {
public static void main(String[] args) {
	int num=28;
	int sum=0;
	for(int start=1;start<num;start++)
	{
		if(num%start==0)
			sum=sum+start;
	}
	System.out.println(sum);
	if(sum==num)
	{
		System.out.println("Number is perfect number");
	}
}
}
