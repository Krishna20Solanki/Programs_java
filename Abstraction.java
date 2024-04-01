abstract class vehicle
{
	abstract void start();
}
class car extends vehicle
{
	void start()
	{
		System.out.println("car start");
	}
}
class bike extends vehicle
{
	void start()
	{
		System.out.println("bike start");
	}
}
class Abstraction
{
	public static void main(String[] args) 
	{
		vehicle v=new car();
		v.start();
		v=new bike();
		v.start();
	}
}