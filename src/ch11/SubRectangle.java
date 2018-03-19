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
	
	//Override Abstract Method show()
	@Override
	public void show() 
	{
		System.out.println("color = " + color + ", area = " + (length * width));
		
	}

}
