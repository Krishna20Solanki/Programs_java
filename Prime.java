import java.util.*;
class Prime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int no=sc.nextInt();
		boolean Prime=true;
		for(int i=2; i<=no; i++)
		{
			for(int j=2; j<=no/2; j++)
			{
				if (no%j==0)
					Prime=false;
			}
		}
		if(Prime)
		{
			System.out.println("this no is prime:"+no);
		}	
		else
		{
			System.out.println("this no is not prime:"+no);
		}
	}
}


// import java.util.Scanner;  
  
// import java.util.Scanner;  
  
// class Prime{  
  
//    public static void main(String[] args) {  
//        Scanner s = new Scanner(System.in);  
//        System.out.print("Enter a number : ");  
//        int n = s.nextInt();  
//        if (isPrime(n)) {  
//            System.out.println(n + " is a prime number");  
//        } else {  
//            System.out.println(n + " is not a prime number");  
//        }  
//    }  
  
//    public static boolean isPrime(int n) {  
//        if (n <= 1) {  
//            return false;  
//        }  
//        for (int i = 2; i < Math.sqrt(n); i++) {  
//            if (n % i == 0) {  
//                return false;  
//            }  
//        }  
//        return true;  
//    }  
// }  