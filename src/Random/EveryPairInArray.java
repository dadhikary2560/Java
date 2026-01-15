package Random;




public class EveryPairInArray {
public static void main(String[] args) {
	int arr[]= {1,2,3};
	for(int i=0;i<arr.length-1;i++)
	{
		System.out.println("pair when array element is: "+arr[i]);
		for(int j=i+1;j<arr.length;j++)
		{
			System.out.println("("+arr[i]+","+arr[j]+")");
		}
	}
}
}
