
public class LineStar {
public static void main(String[] args) {
	System.out.print("*");
	System.out.println();
	for(int line=1;line<=4;line++)
	{
		for(int lineStar=1;lineStar<=line;lineStar++)
		{
			System.out.print(lineStar);
		}
		System.out.print("*");
		System.out.println();
	}
}
}
