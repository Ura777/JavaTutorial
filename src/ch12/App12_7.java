/*
 * String Buffer類別庫
 * 
 * 如果要修改、連接字串的話，可以使用此類別庫。
 * 
 * 此範例為列出常用的Method。
 */

package ch12;

public class App12_7 
{

	public static void main(String[] args) 
	{
		//宣告StringBuffer變數，緩衝區字串為Black & White。
		StringBuffer stringBuffer = new StringBuffer("Black & White");
		System.out.println("String Buffer內的原始字串內容 = " + stringBuffer);
		
		//取得長度
		System.out.println("length = " + stringBuffer.length());
		
		//將某個特定範圍內的字串，用新的字串取代掉(包前不包後)。
		System.out.println("\n=====將Black用cats取代=====\n" + stringBuffer.replace(0, 5, "cats"));
		System.out.println("\n=====將White用dogs取代=====\n" + stringBuffer.replace(7, 12, "dogs"));
		
		//將字串反轉
		System.out.println("\n=====將字串反轉=====\n" + stringBuffer.reverse());
		
		//印出StringBuffer內的字串
		System.out.println("\nString Buffer內現在的字串內容 = " + stringBuffer);

	}

}
