/*
 * String類別庫
 * 
 * 呼叫String的Method都不會修改到原始內容。
 * 
 * 此範例為列出常用的Method。
 */

package ch12;

public class App12_6 
{

	public static void main(String[] args) 
	{
		String str = "Easier said than done.";
		System.out.println("str原始的字串內容 = " + str);
		
		//取得長度
		System.out.println("length = " + str.length());
		
		//取得特定位置的字元
		System.out.println("charAt(8) = " + str.charAt(8));
		
		//取出特定位置之後的字串(包含該位置)
		System.out.println("substring(7) = " + str.substring(7));
		
		//取出一段特定位置的字串(包前不包後)
		System.out.println("substring(7, 11) = " + str.substring(7, 11));
		
		//是否以某個字串為開頭
		System.out.println("start with \"th\" = " + str.startsWith("th"));
		
		//轉換成大寫
		System.out.println("toUpperCase = " + str.toUpperCase());
		
		//轉換成小寫
		System.out.println("toLowerCase = " + str.toLowerCase());
		
		/*
		 * 將字串以特定的字元作切割，
		 * 由於會return Array，
		 * 因此必須以Array來儲存回傳結果。
		 */
		String sentence[] = str.split(" ");
		System.out.println("\n=====split(\" \")=====");
		
		/*
		 * foreach語法，
		 * 可以走訪Array或是Collection，
		 * 可以視為for loop的加強版。
		 */
		for(String word:sentence)
		{
			System.out.println(word);
		}
		
		//印出str內的字串內容
		System.out.println("\nstr現在的字串內容 = " + str);
		
		//減去頭尾的空白
		String str02 = " Easier said than done. "; 
		System.out.println("\n=====Before trim()=====\n" + str02);
		System.out.println("=====After trim()=====\n" + str02.trim());
		
		System.out.println("\n=====equalsIgnoreCase()=====");
		//宣告使用者輸入的密碼
		String userInputCode = "RaStckRsuA5569";
		//宣告系統預設的密碼
		String systemCorrectCode = "rasTCKRsUa5569";
		//印出兩者的密碼以便觀察
		System.out.println("User input code = " + userInputCode);
		System.out.println("System correct code = " + systemCorrectCode);
		//比較2個字串是否相同(忽略大小寫)
		if(userInputCode.equalsIgnoreCase(systemCorrectCode))
		{
			System.out.println("Input code is correct!");
		}
		else
		{
			System.out.println("Input code is correct!");
		}


	}

}
