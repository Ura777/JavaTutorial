/*
 * 傳值 Pass by Value
 */

package ch07;

public class App7_4 
{

	public static void main(String[] args) 
	{
		int num = 5;
		
		add10(num); //Call add10(), Parameter is num.
		System.out.println("in main(), num = " + num);

	}
	
	//add10() Method
	public static void add10(int value)
	{
		value = value + 10;
		System.out.println("in add10(), value = " + value);
	}

}
