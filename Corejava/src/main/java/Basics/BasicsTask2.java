package Basics;

import java.util.Scanner;

public class BasicsTask2 {

	public static void main(String[] args) {
		char operator;
		double Number1, Number2, Result;
		Scanner input = new Scanner(System.in);
		System.out.println("choose an operator: +, -, *, %, or /");
		operator = input.next().charAt(0);
		System.out.println("Enter first number");
		Number1=input.nextDouble();
		System.out.println("Enter second number");
		Number2=input.nextDouble();
		switch(operator) {
		case '+' :
			Result = Number1 + Number2;
			System.out.println(Number1+" + "+Number2+" = "+Result);
			break;
		case '-' :
			Result = Number1 - Number2;
			System.out.println(Number1+" - "+Number2+" = "+Result);
			break;
		case '*' :
			Result = Number1 * Number2;
			System.out.println(Number1+" * "+Number2+" = "+Result);
			break;
		case '%' :
			Result = Number1 % Number2;
			System.out.println(Number1+" % "+Number2+" = "+Result);
			break;
		case '/' :
			Result = Number1 % Number2;
			System.out.println(Number1+" / "+Number2+" = "+Result);
			break;
			
			default:
				System.out.println("Invalid Operator");
				break;
		}
		input.close();
	}

	}

