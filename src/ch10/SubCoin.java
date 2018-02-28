/*
 * SubClass
 */

package ch10;

class SubCoin extends SuperCircle
{
	private int value;

	//Constructor
	public SubCoin() 
	{
		System.out.println("SubCoin() constructor called.");
	}
	
	//Method
	public void setValue(int t)
	{
		value = t;
		System.out.println("value = " + value);
	}

}
