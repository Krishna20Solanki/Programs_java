// infinite loop

class Loop4
{
	public static void main(String[] args) 
	{
		for(byte i=5;i>=1;i++)
		{
			for(byte j=5; j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println("\n");
		}	
	}
}