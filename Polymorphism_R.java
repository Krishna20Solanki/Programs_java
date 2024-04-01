import java.util.*;
class First
{
	void process(int num)
	{
		System.out.println("Cube is:"+(num*num*num));
	}
}
class Second extends First
{
	@Override
	void process(int num)
	{
		System.out.println("Square is:"+(num*num));
		super.process(num);
	}
}
class Polymorphism_R
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		First f=new Second();
		System.out.print("Enter number:");
		int no=sc.nextInt();
		f.process(no);
	}
}