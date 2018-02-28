/*
 * switch-case
 */

package ch05;

import java.util.Scanner;

public class App5_10 
{

	public static void main(String[] args) 
	{
		int x=50, y=20;
		char operator;
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please input the operator(+ - * / %):");
		operator = myScanner.next().charAt(0);
		
		switch(operator)
		{
			case '+':
				System.out.println(x + " + " + y + " = " + (x+y));
				break;
				
			case '-':
				System.out.println(x + " - " + y + " = " + (x-y));
				break;
				
			case '*':
				System.out.println(x + " * " + y + " = " + (x*y));
				break;
				
			case '/':
				System.out.println(x + " / " + y + " = " + (x/y));
				break;
				
			case '%':
				System.out.println(x + " % " + y + " = " + (x%y));
				break;
				
			default:
				System.out.println("Unknown expression!!!");
		}
		
		myScanner.close();

	}

}
