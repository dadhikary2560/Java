package Random;


//Reverse the elements of an array using a loop.
public class ReverseElementsOfAnArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};				
	//don't think the whole, first think only about 1,2 -> 2,1
	//then 1,3 -> 3,1
	
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
		}
	}
	System.out.println(java.util.Arrays.toString(arr));
}
}
