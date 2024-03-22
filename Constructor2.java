import java.util.*;
class Formula
{
	Scanner sc=new Scanner (System.in);
	int a,b;
	Formula()
	{
		System.out.println("Enter number one");
		a=sc.nextInt();
		System.out.println("Enter number two");
		b=sc.nextInt();
	}
	void add()
	{
		System.out.println("Addition is :" +(a+b));
	}
}

class Constructor2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		Formula f=new Formula();
		System.out.println("Enter choice number");
		int c_no=sc.nextInt();
		switch(c_no)
		{
		case 1:
			System.out.println("Addition");
			f.add();
			break;
		default:
			System.out.println("please enter above number...");
		}	
	}
}