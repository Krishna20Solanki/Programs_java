import java.util.*;
class Cdno
{
	int no,rem,c=0;
	Scanner sc=new Scanner(System.in);
	Cdno()
	{
		System.out.println("enter number");
		no=sc.nextInt();
		while(no!=0)
		{
			rem=no%10;
			if(rem==0)
				c++;
			no=no/10;
		}
		if(c>0)
		{
			System.out.println("Duck");
		}
		else
		{
			System.out.println("not duck");
		}
	}
}
class Duck
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Cdno c=new Cdno();
		// int no=sc.nextInt();
	}
}