import java.util.*;
class Cbno
{
	int no,rem,c=0;
	Scanner sc=new Scanner(System.in);
	Cbno(int no)
	{
		if(no%10==7 || no%7==0)
		{
			System.out.println("buzz");
		}
		else
		{
			System.out.println("not buzz");
		}
	}
}
class Buzz
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Buzz num:");
		int no=sc.nextInt();
		//Cbno c1=new Cbno();
		Cbno c=new Cbno(no);	
	}
}