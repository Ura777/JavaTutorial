/*
 * do while
 */

package ch05;

import java.util.Scanner;

public class App5_6 
{

	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		int input=0, i=1, sum=0;
		
		//持續輸入，直到input>=1。
		do
		{
			System.out.println("請輸入累加的最大值：");
			input = myScanner.nextInt();
		}while(input < 1);
		
		do
			//sum = sum + i
			sum+=i++;
		while(i <= input);
		
		System.out.println("1 + 2 + ... + " + input + " = " + sum);
		
		myScanner.close();

	}

}
