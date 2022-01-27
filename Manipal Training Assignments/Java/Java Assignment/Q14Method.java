package Java_Assignment;

public class Q14Method {
	public void Q14Method(int n)
	{
		int op=0;
		int temp=0;
		while(n>0)
		{
			temp=n%10;
			op=op*10+temp;
			n=n/10;
		}
		System.out.println(op);
	}
}
