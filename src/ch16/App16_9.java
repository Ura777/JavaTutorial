/*
 * 走訪集合物件的元素
 * 
 * Java提供了3種方式：
 * 1.for-each迴圈
 * 2.Iterator介面
 * 3.ListIterator介面
 * ================================
 * 本範例為for-each迴圈
 * 
 * for-each的注意事項：
 * 1.只能從起始處開始訪問Elements
 * 2.只能取出Elements不能置換
 * 3.迴圈內的變數為區域變數
 * 4.Java Version >= 5.0 才能夠使用
 */

package ch16;

import java.util.TreeSet;

public class App16_9 
{

	public static void main(String[] args) 
	{
		//宣告TreeSet物件，資料型態為String。
		TreeSet<String> zoo = new TreeSet<>();
		
		zoo.add("Monkey");
		zoo.add("Bunny");
		zoo.add("Puppy");
		zoo.add("Kitty");
		
		System.out.print("TreeSet的內容 = ");
		
		//變數animal的資料型態必須跟TreeSet物件的一樣
		for(String animal:zoo)
		{
			System.out.print(animal + " ");
		}
	}

}
