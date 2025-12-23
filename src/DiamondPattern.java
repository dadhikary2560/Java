
public class DiamondPattern {
public static void main(String[] args) {
	for(int line=1;line<=4;line++)
	{
		for(int space=4;space>line;space--)
		{
			System.out.print(" ");
		}
		for(int star=1;star<=line*2-1;star++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int line=1;line<=3;line++)
	{
		for(int space=1;space<=line;space++)
		{
			System.out.print(" ");
		}
		for(int star=6-(line*2-1);star>=1;star--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
