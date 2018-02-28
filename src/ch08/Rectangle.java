/*
 * Class Rectangle
 */

package ch08;

class Rectangle 
{
	//Data Member，又可以稱為Field。
	int width;
	int height;
	
	//Function Member
	int area()
	{
		return width*height;
	}
	
	int perimeter()
	{
		return 2*(width + height);
	}

}
