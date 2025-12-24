
public class HollowDiamondHalf {
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
}
}
