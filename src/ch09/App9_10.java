/*
 * 在建構元裡面建立內部類別的物件
 */

package ch09;

//外部類別
public class App9_10 
{
	//外部類別的Constructor
	public App9_10() 
	{
		//建立內部類別MyNumber的物件
		MyNumber number01 = new MyNumber();
		number01.set_num(5);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		App9_10 object = new App9_10(); //建立外部類別App9_10的物件
	}
	
	//內部類別
	static class MyNumber
	{
		int num;
			
		void set_num(int n)
		{
			this.num = n;
			System.out.println("num = " + num);
		}
	}

}
