/*
 * Protected成員的使用
 * 請搭配SuperCircle3與SubCoin3
 * 
 * 如果想開放權限讓Sub Class可以使用Super Class內的private成員，
 * 可以將private修改成protected。
 * 
 * protected最大的好處為同時兼顧安全性與便利性，
 * 只能夠讓Sub Class存取，外界無法更改或讀取。
 */

package ch10;

public class App10_3 
{

	public static void main(String[] args) 
	{
		
		SubCoin3 coin = new SubCoin3(2.5, 10);
		coin.show();

	}

}
