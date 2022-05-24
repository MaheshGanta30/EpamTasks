package ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {

		public MissingNumbers(int arr[], int N) {
			try {
		int i;
		int diff=arr[0]-0;
		for( i=0;i<N-1;i++);
		{
			if(arr[i]-i!=diff)
			{
				while(diff<arr[i]-i)
				{
					System.out.print((i+diff)+" ");
					diff++;
				}
			}
		}}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
	 
	public static void main(String args[])
	{
		int arr[]= {20,30};
		int N=arr.length;
		MissingNumbers hh=new MissingNumbers(arr, N);
		//System.out.println("ok");
	}
 
}