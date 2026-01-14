package Random;



//Check if an array contains duplicate elements using nested loops.
public class ArrayDuplicateElements {
	private void myMethod(int arr1[])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					System.out.println("Duplicate found for: "+arr1[i]+" at "+j);
					break;
				}
			}
		}
	}
public static void main(String[] args) {
	int arr[]= {5,4,5,1,3,2,1};
	ArrayDuplicateElements obj=new ArrayDuplicateElements();
	obj.myMethod(arr);
	
}
}
