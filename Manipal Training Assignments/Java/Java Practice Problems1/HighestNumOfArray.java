package training_mpl;

import java.util.Arrays;

public class HighestNumOfArray {
	public int HighestNumOfArray(int n[])
	{
		Arrays.sort(n);
		return n[n.length-1];
	}
}
