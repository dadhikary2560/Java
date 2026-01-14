package Random;


//Find all pairs whose sum is equal to a given number.
public class ElementsPairSum {
public static void main(String[] args) {
	int arr[]= {5,4,3,2,1};
	int target=7;
	for(int i=0;i<arr.length-1;i++)
	{
	//	System.out.println("pair that is equal to target");
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]+arr[j]==target)
			{
				System.out.println("("+arr[i]+","+arr[j]+")");
			}
		}
	}
}
}
