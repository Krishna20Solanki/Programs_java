class Odd_Even
{
	public static void main(String[] args) 
	{
		short i=1;
		while(i<=20)
		{
			if(i%2==0)
			{
				System.out.println(i+ " even \n");
			}
			else
			{
				System.out.println(i+ " odd \n");
			}
			i++;
		}	
	}
}