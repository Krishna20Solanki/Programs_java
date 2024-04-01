import java.util.*;
class Get
{
	Scanner sc=new Scanner(System.in);
	int i,j,no;
	int num[]=new int[5];
}
class Sort extends Get
{
	Sort()
	{
		for(i=0;i<num.length;i++)
		{
			System.out.print("Enter number:");
			num[i]=sc.nextInt();
		}
	}
	void Process()
	{
		System.out.println("\n Sorting");
		int temp=0;
		for(i=0;i<num.length;i++)
		{
			for(j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			System.out.print("number is:"+num[i]+"\n");
		}
	}
}
class Pattern extends Get
{
	Pattern()
	{
		System.out.print("Enter number:");
		no=sc.nextInt();
	}
	void floyd()
	{
		int k=1;
		for(i=1;i<=no;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println(" "+k);
				k++;
			}
			System.out.println();
		}
	}
}
class Hierarchical
{
	public static void main(String[] args) 
	{
		Sort s=new Sort();
		s.Process();
		Pattern p=new Pattern();
		p.floyd();
	}
}