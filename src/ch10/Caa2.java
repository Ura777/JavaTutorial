/*
 * Class Caa2
 */

package ch10;

class Caa2 
{
	private int num;

	//Constructor
	public Caa2(int n) 
	{
		num = n;
	}

	//Method
	@Override
	public String toString() 
	{
		String str = "toString() called, num = " + num;
		return str;
	}
	
}
