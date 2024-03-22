// 3. Write a program that takes three numbers and checks and then prints the greatest number

import java.util.Scanner;  
class Gretest  
{
	public static void main(String[] args) 
	{
		int a,b,c,large,ternary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		a=sc.nextInt();
		System.out.println("Enter second number:");
		b=sc.nextInt();
		System.out.println("Enter third number:");
		c=sc.nextInt();
		ternary=a>b?a:b;
		large=c>ternary?c:ternary;
		System.out.println("the largest number is:"+large);
	}
}