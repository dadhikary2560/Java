
public class PrimeNumber1to100 
{
	public static void main(String[] args) 
	{
		
		for(int num=1;num<=100;num++)
		{
			int counter=0;
			if(num<2)
			{
				continue;
			}
			else
			{
				for(int i=2;i<num;i++)
				{
					if(num%i==0)
					{
						counter=1;
						break;
					}	
				}
			}
			if(counter==0)
			{
				System.out.print(num+" ");
			}
		}
	}
}
