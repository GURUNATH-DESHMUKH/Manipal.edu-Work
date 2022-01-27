package Java_Assignment;

import java.util.ArrayList;

public class Q13Method {
	public void Q13Method(int n){
		
		for(int i=2;i<=n;i++)
		{      
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{            
					flag=1;      
					break;      
				}    
			}
			if(flag==0)  
			{ 
				System.out.println(i); 
			} 
		}  
	}
}
