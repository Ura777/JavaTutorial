/*
 * SubClass
 */

package ch10;

class SubSquare extends SuperShape
{
	private double sideLength;

	//Constructor
	public SubSquare(double sL) 
	{
		sideLength = sL;
	}

	//Method
	@Override
	public double area() 
	{
		return Math.pow(sideLength, 2);
	}
	
}
