package Java_Assignment;

public class Q11Method {
	public void Q11Method(int n)
	{
		if(n==0)
			System.out.println("1");
		int res=1;
		for(int i=1;i<=n;i++)
		{
			res=i*res;
		}
		System.out.println("Factorial of "+n+" is "+res);
	}
}
