/*
 * Class Box
 */

package ch09;

//外部類別
public class Box 
{
	//外部類別的資料成員
	private int length;
	private int width;
	private int height;
	private MyColor boxColor;
	
	//外部類別的Constructor
	public Box(int l, int w, int h, String col) 
	{
		this.length = l;
		this.width = w;
		this.height = h;
		this.boxColor = new MyColor(col); //內部類別MyColor的變數
	}
	
	//外部類別的show()，顯示length、width、height、boxColor。
	public void show()
	{
		System.out.println("length = " + this.length);
		System.out.println("width = " + this.width);
		System.out.println("height = " + this.height);
		System.out.println("color = " + this.boxColor.color);
		//this.boxColor.showColor();
	}

	//內部類別
	class MyColor
	{
		//內部類別的資料成員
		private String color;

		//內部類別的Constructor
		public MyColor(String color) 
		{
			this.color = color;
		}
		
		//內部類別的show()，顯示color。
		public void showColor()
		{
			System.out.println("color = " + this.color);
		}
		
		
	}

}
