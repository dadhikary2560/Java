
public class HollowDiamondFull {
public static void main(String[] args) {
	for(int line=1;line<=4;line++)
	{
		for(int outSpace=4;outSpace>line;outSpace--)
		{
			System.out.print(" ");
		}
		if(line==1)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print("*");
			for(int inSpace=1;inSpace<=(line-1)*2-1;inSpace++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
		}
		System.out.println();
	}
	for(int line=1;line<=3;line++)
	{
		for(int oSpace=1;oSpace<=line;oSpace++)
		{
			System.out.print(" ");
		}
		if(line==3)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print("*");
			for(int iSpace=1;iSpace<=2-((line-1)*2-1);iSpace++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
		}
		System.out.println();
	}
}
}
