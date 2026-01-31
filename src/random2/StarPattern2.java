package random2;

public class StarPattern2 {
	//Print Stars and Spaces Alternating (Stars and Blank Spaces) 
	//(b = blank space here)
	private void starWithSpace() {
		for(int line=1;line<=5;line++)
		{
			for(int space=5;space>line;space--)
				System.out.print("b");
			for(int star=1;star<line;star++)
				System.out.print("*b");
			System.out.print("*");
			System.out.println();
		}
	}
	private void starWithSpace2() {
		for(int line=1;line<=5;line++)
		{
			for(int space=5;space>line;space--)
				System.out.print(" ");
			for(int star=1;star<=line;star++)
				System.out.print("* ");
			System.out.println();
		}
	}
	//Increasing Sequence (1, 12, 123, 1234, 12345)
	private void increasingSequence() {
		for(int line=1;line<=5;line++)
		{
			int num=1;
			for(int printNum=1;printNum<=line;printNum++)
				{
					System.out.print(num);
					num++;
				}
			System.out.println();
		}
	}
	//Print Repeated Numbers per Row (Same Number Repeated)
	private void repeatedNumbers() {
		for(int line=1;line<=5;line++)
		{
			for(int printNum=1;printNum<=line;printNum++)
				System.out.print(line);
			System.out.println();
		}
	}
	//Increasing Sequence (1, 2 3, 4 5 6, 7 8 9 10, 11 12 13 14 15)
	private void increasingSequence2() {
		int num=1;
		for(int line=1;line<=5;line++)
		{
			for(int printNum=1;printNum<=line;printNum++)
			{
				System.out.print(num+" ");
				num++;
			}
		System.out.println();
		}
	}
	private void increasingSequence2_part2() {
		int num=1;
		for(int line=1;line<=8;line++)
		{
			for(int printNum=1;printNum<=line;printNum++)
			{
				System.out.print(num+" ");
				num++;
				if(num==10)
					num=0;
			}
		System.out.println();
		}
	}
	//series A, B C, D E F, G H I J
	private void seriesABCD() {
		int num=65;
		for(int line=1;line<=5;line++)
		{
			for(int printNum=1;printNum<=line;printNum++)
			{
				System.out.print((char)num+" ");
				num++;
			}
			System.out.println();
		}
	}
	private void seriesABCD_2() {
		int num=65;
		for(int line=1;line<=5;line++)
		{
			for(int printNum=1;printNum<=line;printNum++)
			{
				System.out.print((char)num+" ");
			}
			num++;
			System.out.println();
		}
	}
	private void seriesABCD_3() {
		for(int line=1;line<=5;line++)
		{
			int num=65;
			for(int printNum=1;printNum<=line;printNum++)
			{
				System.out.print((char)num+" ");
				num++;
			}
			
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		StarPattern2 obj=new StarPattern2();
		obj.starWithSpace();
		obj.starWithSpace2();
		obj.increasingSequence();
		obj.repeatedNumbers();
		obj.increasingSequence2();
		obj.increasingSequence2_part2();
		obj.seriesABCD();
		obj.seriesABCD_2();
		obj.seriesABCD_3();
}
}
