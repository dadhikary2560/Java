
public class PrintABCDTrianglePattern {
public static void main(String[] args) {
	int a=65;
	//System.out.println((char)a);
	for(int line=1;line<=5;line++)
	{
		for(int space=5;space>line;space--)
		{
			System.out.print(" ");
		}
		for(int print=a;print<a+line;print++)
		{
			System.out.print((char)print+" ");
		}
		System.out.println();
	}
}
}
