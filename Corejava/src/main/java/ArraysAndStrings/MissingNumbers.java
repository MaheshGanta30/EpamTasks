package ArraysAndStrings;

import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n=input.nextInt();
		int inputArray[] = new int[n];
		System.out.println("Enter" +(n-1)+"numbers: ");
		for(int i=0; i<n-2; i++) {
			inputArray[i]=input.nextInt();
		}
		//Finding the missing number
		int Sumofall = (n*(n+1))/2;
		int SumofArray = 0;
		for(int i=0; i<=n-2; i++) {
			SumofArray = SumofArray + inputArray[i];
		}
		int missingNumber = Sumofall - SumofArray;
		System.out.println("Missing number is "+missingNumber);
	}

	}
