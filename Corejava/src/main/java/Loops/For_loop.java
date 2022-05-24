package Loops;

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		
		int row,col,Totalrows,k=0, increment;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		Totalrows=input.nextInt();
		System.out.println("Enter Increment value");
		increment=input.nextInt();
		for (row=0; row<Totalrows; row++) {
			for(col=0; col<row; col++) {
				System.out.print(k+" ");
				k+=increment;
			}
			System.out.println();
		}

	}

}
