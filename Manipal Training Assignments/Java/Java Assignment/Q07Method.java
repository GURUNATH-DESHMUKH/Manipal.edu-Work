package Java_Assignment;

public class Q07Method {
	void Q07Method(int n)
	{
		double op=0;
		double init=2;
		double terms=n/2;
		op=(terms/2)*(2*init+(terms-1)*2);
		System.out.println("Sum of even nuumbers till "+n+" is ");
		System.out.print((int)op);
		
	}
}
