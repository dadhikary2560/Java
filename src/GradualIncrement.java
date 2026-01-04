
public class GradualIncrement {
public static void main(String[] args) {
	
	//-----------------------------------------------
	/*int endResult=0;
	for(int line=1;line<=4;line++)
	{	
		for(int num=endResult+1;num<=line*line-endResult;num++)
		{
			System.out.print(num+" ");	
		}
		endResult=line*line-endResult;
		System.out.println();
	}*/
	//--------------------------------------------------
	
	//Another Way to do the program in very easy way
	int num=1;
	for(int line=1;line<=5;line++)
	{
		for(int print=1;print<=line;print++)
		{
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
	}
}
}
