// Complie time polymorphism using method over loading
class first
{
	void add()
	{
		int a=20,b=10;
		System.out.println("addition is:"+(a+b));
	}
	void add(int i, int j)
	{
		System.out.println("addition is:"+(i+j));
	}
	void add(int a, double b)
	{
		System.out.println("addition is:"+(a+b));
	}
}
class Polymorphism_C
{
	public static void main(String[] args) 
	{
		first f=new first();
		f.add(30,50);
		f.add(50,2.5);
		f.add();
	}
}