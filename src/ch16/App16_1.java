/*
 * 集合物件 Collection
 * 
 * 將資料聚集在一起，以某種方式來存取這些資料的物件。
 * 物件中的資料被稱為元素(Elements)。
 * 
 * 概念上與Array相似，但是可以隨意增減元素的個數，
 * 比Array更有彈性。
 * 
 * <HashSet>
 * 利用雜湊法存取元素的Collection，
 * Elements皆不可以重複。
 * 
 * 本範例為簡單的HashSet範例
 */

package ch16;

import java.util.HashSet;

public class App16_1 
{

	public static void main(String[] args) 
	{
		//宣告HashSet物件，Elements型態為String
		HashSet<String> hset = new HashSet<>();
		
		//加入資料
		hset.add("Monkey");
		hset.add("Bunny");
		hset.add("Monkey");
		
		System.out.println("HashSet內容 = " + hset);

	}

}
