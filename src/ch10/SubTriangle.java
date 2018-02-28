/*
 * SubClass
 */

package ch10;

class SubTriangle extends SuperShape
{
	private double bottom, height;

	//Constructor
	public SubTriangle(double btm, double h) 
	{
		bottom = btm;
		height = h;
	}

	//Method
	@Override
	public double area() 
	{
		return bottom * height / 2;
	}
	
}
