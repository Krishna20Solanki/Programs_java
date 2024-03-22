// 2. Write a program user through input one number and then check. This no is
// AutomorphicNumber or not. Using Constructor.

import java.util.*;
class Process
{
	Scanner sc=new Scanner(System.in);
	int no, s_r, sqr, temp, count=0;
	Process()
	{
		System.out.print("enter number:");
		no=sc.nextInt();
	}
	void perform()
	{
		temp=no;
		sqr=temp*temp;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		s_r=sqr%(int)Math.pow(10,count);
		if(s_r==no)
		{
			System.out.println("this number is Automorphic");
		}
		else
		{
			System.out.println("this number is not Automorphic");
		}
	}
}
class Auto_morphism
{
	public static void main(String[] args) 
	{
		Process p=new Process();
		p.perform();	
	}
}