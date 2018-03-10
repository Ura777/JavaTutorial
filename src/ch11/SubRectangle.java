/*
 * Sub Class
 */

package ch11;

class SubRectangle extends AbstractShape
{
	protected int length, width;

	//Constructor
	public SubRectangle(int len, int wid) 
	{
		length = len;
		width = wid;
	}

	//Method
	public int area()
	{
		return length * width;
	}
	
	//Override Abstract Method show()
	@Override
	public void show() 
	{
		System.out.println("color = " + color + ", area = " + area());
		
	}

}
