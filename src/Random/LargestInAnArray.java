package Random;



//Find the largest element in an array using a loop.
public class LargestInAnArray {
public static void main(String[] args) {
	int arr[]= {8,5,8,17,1,28};
	int max=arr[0];
	for(int j=1;j<arr.length;j++)
	{
		if(max<arr[j])
			max=arr[j];
	}
	System.out.println(max);
}
}
