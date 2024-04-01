import java.util.*;
interface User
{
	void input();
	void output();
}
class Process implements User
{
	Scanner sc=new Scanner(System.in);
	String emp_nm;
	double sal;
	public void input()
	{
		System.out.println("Input \n");
		System.out.print("Enter emoloyee name:");
		emp_nm=sc.nextLine();
		System.out.print("Enter employee salary:");
		sal=sc.nextDouble();
	}
	public void output()
	{
		System.out.println("Output \n");
		System.out.println("Employee name:"+emp_nm);
		System.out.println("Employee salary:"+sal);
	}
}
class Interface
{
	public static void main(String[] args) 
	{
		User u=new Process();
		u.input();
		u.output();
	}
}