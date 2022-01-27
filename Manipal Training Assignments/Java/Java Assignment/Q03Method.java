package Java_Assignment;

public class Q03Method {
	public void Q03Method(int a,int b, int c)
	{
		if(a>b && a>c)
		{
			System.out.println("Biggest number is "+a);
		}
		else if(c>b && c>a)
		{
			System.out.println("Biggest number is "+c);			
		}
		else
		{
			System.out.println("Biggest number is "+b);			
		}
	}
}
