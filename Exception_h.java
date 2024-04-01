import java.util.*;
class Error
{
	Scanner sc=new Scanner(System.in);
	Error()
	{
		System.out.print("enter number:");
		int no=sc.nextInt();
		System.out.print("Enter div number:");
		int d_no=sc.nextInt();
		int div=0;
		try
		{
			div=no/d_no;
			System.out.println("division:"+div);
		}
		catch(Exception e)
		{
			System.out.println("do not insert zero:"+e);
		}
	}
}
class Exception_h
{
	public static void main(String[] args) 
	{
		Error e=new Error();
	}
}