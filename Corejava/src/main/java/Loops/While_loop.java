package Loops;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		
		int i=0,j,n,k=0;
		int Increment = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		n=input.nextInt();
		System.out.println("Enter increment value");
		Increment=input.nextInt();
		
		while (i<=n) {
			j=0;
			while(j<i) {
				System.out.print(k+" ");
				k+=Increment;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
