package Java_Assignment;

public class Q12Method {
	public void Q12Method(int n)
	{
		int i;
		int flag=0;
		if(n==0||n==1)
		{  
			System.out.println(n+" is not prime number");      
		}
		else
		{  
			for(i=2;i<=n/2;i++)
			{      
				if(n%i==0)
				{      
					System.out.println(n+" is not prime number");      
					flag=1;      
					break;      
				} 
			}      
			if(flag==0)  
			{ 
				System.out.println(n+" is prime number"); 
			} 
		}
	}
}
