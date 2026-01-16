package Random;


//Print all triplets of numbers in an array.
public class TripletsInArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	for(int i=0;i<arr.length-2;i++)
	{
		System.out.println("for "+arr[i]+" Triplets are: ");
		for(int j=i+1;j<arr.length-1;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				System.out.print("("+arr[i]+","+arr[j]+","+arr[k]+")");
			}
			System.out.println();
		}
	}
}
}
