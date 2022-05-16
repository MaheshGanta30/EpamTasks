package Loops;

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		
		int row,col,n,k=0, increment;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		n=input.nextInt();
		System.out.println("Enter Increment value");
		increment=input.nextInt();
		for (row=0; row<n; row++) {
			for(col=0; col<row; col++) {
				System.out.print(k+" ");
				k+=increment;
			}
			System.out.println();
		}

	}

}
