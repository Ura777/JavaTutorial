/*
 * 匿名內部類別 Anonymous Inner Class
 * 
 * 編譯後的Class檔會有3個：
 * App9_11.class為外部類別
 * App9_11$MyNumber.class為內部類別
 * App9_11$1.class為匿名內部類別，表示為App9_11的第1個匿名內部類別。
 * 匿名內部類別通常會用來撰寫事件(Event)
 */

package ch09;

//外部類別
public class App9_11 
{

	public static void main(String[] args) 
	{
		//建立匿名內部類別物件
		(new MyNumber()
			{
				//補足內部類別裡沒有定義到的Method
				void set_num(int n)
				{
					this.num = n;
					System.out.println("num = " + n);
				}
			}
		).set_num(5); //執行匿名內部類別裡所定義的Method

	}
	
	//內部類別
	static class MyNumber
	{
		int num;
	}

}
