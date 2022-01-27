package Java_Assignment;

public class Q10Method {
	public int[] Q10Method(int[] arr)
	{
		int i=0;
		int j=1;
		int res[] = new int[arr.length];
		int k=0;
		while(j<res.length) {
			res[k] = arr[j];
			k++;
			res[k] = arr[i];
			k++;
			i = j+1;
			j = i+1;
		}
		while(i<res.length) {
			res[i] = arr[i];
			i++;
		}
		 return res;
	}
}
