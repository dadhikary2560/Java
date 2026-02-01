package random2;

public class StarPattern {

	
	//Print a Right-Aligned Triangle of Stars
	private void rightAngled() {
		for(int line=1;line<=5;line++)
		{
			for(int space=5;space>line;space--)
				System.out.print(" ");
			for(int star=1;star<=line;star++)
				System.out.print("*");
			System.out.println();
		}
	}
	//print stars in Even Numbers (2, 4, 6, 8, 10)
	private void patternEvenNumbers() {
		for(int line=1;line<=5;line++)
		{
			for(int star=1;star<=line*2;star++)
				System.out.print("*");
			System.out.println();
		}
	}
	//Print Stars in Odd Numbers (1, 3, 5, 7, 9)
	private void patternOddNumbers() {
		for(int line=1;line<=5;line++)
		{
			for(int star=1;star<=line*2-1;star++)
				System.out.print("*");
			System.out.println();
		}
	}
	//Print a Centered Pyramid of Stars
	private void pyramidStarPattern() {
		for(int line=1;line<=5;line++)
		{
			for(int space=5;space>line;space--)
				System.out.print(" ");
			for(int star=1;star<=line*2-1;star++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		StarPattern obj=new StarPattern();
		obj.rightAngled();
		obj.patternEvenNumbers();
		obj.patternOddNumbers();
		obj.pyramidStarPattern();
	}
}
