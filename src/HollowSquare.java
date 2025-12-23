
public class HollowSquare {
public static void main(String[] args) {
	for(int line=1;line<=4;line++)
	{
		if(line==1 || line==4)
		{
			for(int star=1;star<=4;star++)
			{
				System.out.print("* ");
			}	
		}
		else
		{
			for(int star=1;star<=4;star++)
			{
				if(star==1 || star==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
		}
		System.out.println();
	}
}
}
