package Java_Assignment;

public class Q09Method {
	int[] Q09Method(int[] arr)
	{
		int size=arr.length;
		int [] rev=new int[size];
		for(int i=0;i<size;i++)
		{
			rev[size-i-1]=arr[i];
		}
		return rev;
	}
}
