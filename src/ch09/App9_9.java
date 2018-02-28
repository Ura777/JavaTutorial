/*
 * 內部類別 Inner Class
 * 
 * 內部類別編譯後的檔案為App9_9$MyNumber.class
 * 由於main()為static，因此MyNumber內的Method一定要是static，這樣才能夠對MyNumber內的Method進行呼叫。
 */

package ch09;

//外部類別
public class App9_9 
{

	public static void main(String[] args) 
	{
		MyNumber number01= new MyNumber();
		
		number01.set_num(5);

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
