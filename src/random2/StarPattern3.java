package random2;

public class StarPattern3 {
//series ABCD
	private void seriesABCD() {
		char c='A';
		int a=(int)c;
		
		for(int line=1;line<=5;line++)
		{
			for(int space=5;space>line;space--)
				System.out.print(" ");
			for(int printNum=1;printNum<=line*2-1;printNum++)
			{
				System.out.print((char)a);
				a++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		StarPattern3 obj=new StarPattern3();
		obj.seriesABCD();
	}
}
