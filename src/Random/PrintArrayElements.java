package Random;


//Print all elements of a given array.
public class PrintArrayElements {
	void m1(int arr2[]) {
		System.out.println(java.util.Arrays.toString(arr2)); //one way to print
		
		//------------------------------------------
		System.out.println("Array elements are: ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		//-------------------------------------------
		//another way to print array
}
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		PrintArrayElements obj=new PrintArrayElements();
		obj.m1(arr1);
	}
}
