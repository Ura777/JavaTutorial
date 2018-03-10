/*
 * 利用抽象類別的陣列變數來存取子類別物件的成員
 * 請搭配AbstractShape、SubCircle、SubRectangle。
 * 
 * 當建立的物件較多時，可以透過Super Class Array來存放。
 */

package ch11;

public class App11_3 
{

	public static void main(String[] args) 
	{
		//建立AbstractShape陣列
		AbstractShape shape[] = new AbstractShape[2];
		
		//第1個存放的物件為SubRectangle
		shape[0] = new SubRectangle(10, 5);
		shape[0].setColor("Red");
		
		//第2個存放的物件為SubCircle
		shape[1] = new SubCircle(2.0);
		shape[1].setColor("Blue");
		
		//使用for迴圈走訪shape[]
		for(int i=0; i<shape.length; i++)
		{
			//呼叫該物件的show()來顯示該物件的資訊
			shape[i].show();
		}
	}

}
