package Loops;

import java.util.Scanner;

public class Do_While_loop {

	public static void main(String[] args) {
		
		int Rows=0,Columns,Totalrows;
		int count=0;
		int Increment = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		Totalrows=input.nextInt();
		System.out.println("Enter increment value");
		Increment=input.nextInt();
		
		do {
			Columns=0;
			while(Columns<=Rows) {
				System.out.print(count+" ");
				count+=Increment;
				Columns++;
			}
			System.out.println();
			Rows++;
		}while(Rows<Totalrows);
	}


	}

