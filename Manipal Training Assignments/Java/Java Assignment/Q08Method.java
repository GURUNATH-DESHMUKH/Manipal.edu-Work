package Java_Assignment;

public class Q08Method {
	public void Q08Method(int n)
	{
		System.out.println("a. for n="+n);
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("b. for n="+n);
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<n+1;j++)
			{
				System.out.print(n);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("c. for n="+n);
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<=n+1;j++)
			{
				if(i+j-1>n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
