package Random;


//Count the number of triplets whose sum is divisible by 3.
public class TripletsWhoseSumISdivisibleBy3 {
public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	int count=0;
	for(int i=0;i<arr.length-2;i++)
	{
		for(int j=i+1;j<arr.length-1;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				if((arr[i]+arr[j]+arr[k])%3==0)
				{
					count++;
				}
			}
		}
	}
	System.out.println(count);
}
}
