package Loops;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		
		int row=0,column,Totalrows,k=0;
		int Increment = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		Totalrows=input.nextInt();
		System.out.println("Enter increment value");
		Increment=input.nextInt();
		
		while (row<=Totalrows) {
			column=0;
			while(column<row) {
				System.out.print(k+" ");
				k+=Increment;
				column++;
			}
			System.out.println();
			row++;
		}

	}

}
