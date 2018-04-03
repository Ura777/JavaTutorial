/*
 * HashMap
 * 
 * Elements使用關鍵值。
 */

package ch16;

import java.util.HashMap;

public class App16_7 
{
	public static void main(String args[])
	{
		//宣告HashMap物件，Key的型態為Integer，Value的型態為String。
		HashMap<Integer, String> hmap = new HashMap<>();
		
		//加入資料，前者為Key，後者為Value。
		hmap.put(94001, "Alan");
		hmap.put(94002, "Ivan");
		hmap.put(94003, "Ryan");
		
		//元素個數
		System.out.println("HashMap的元素個數 = " + hmap.size());
		//印出內容
		System.out.println("HashMap的內容 = " + hmap);
		//是否有特定的Key
		System.out.println("HashMap當中是否有Key=94002？" + hmap.containsKey(94002));
		//是否有特定的Value
		System.out.println("HashMap當中是否有Value=David？" + hmap.containsValue("David"));
		
		//移除元素
		System.out.println("清除HashMap當中是否有Key=94001的資料" + hmap.remove(94001) + "...");
		System.out.println("HashMap的元素個數 = " + hmap.size());
		System.out.println("HashMap的內容 = " + hmap);
		
		//取得Value
		System.out.println("HashMap當中是否有Key=94003的Value = " + hmap.get(94003));
		
	}

}
