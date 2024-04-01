// Table and Square using Inheritance
import java.util.*;
class User
{
	Scanner sc=new Scanner(System.in);
	int no;
	User()
	{
		System.out.print("Enter Number:");
		no=sc.nextInt();
	}
}
class Table extends User
{
	Table()
	{
		System.out.println("table number is:"+no);
		for(int i=1;i<=10;i++)
		{
			System.out.println("\n"+no+"*"+i+"="+(no*i));
		}
	}
}
class Square extends User
{
	Square()
	{
		System.out.println("Square number is:"+(no*no));
		
	}
}
class Table_Square
{
	public static void main(String[] args) 
	{
		Table t=new Table();
		Square s=new Square();
	}
}