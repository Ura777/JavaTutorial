/*
 * TreeSet類別
 * 
 * 實作SortedSet Interface，
 * Elements會自動排序 + 不可重複。
 * 
 * Elements會由小排到大。
 */

package ch16;

import java.util.TreeSet;

public class App16_4 
{

	public static void main(String[] args) 
	{
		//宣告TreeSet物件，資料型態為Integer。
		TreeSet<Integer> tset = new TreeSet<>();
		
		//加入資料
		for(int i=20; i>=2; i-=2)
		{
			tset.add(i);
		}
		
		//元素個數
		System.out.println("TreeSet的元素個數 = " + tset.size());
		//印出內容
		System.out.println("TreeSet的內容 = " + tset);
		
		//第1個元素
		System.out.println("TreeSet的第1個元素 = " + tset.first());
		//最後1個元素
		System.out.println("TreeSet的最後1個元素 = " + tset.last());
		//取出介於某特定元素之間的元素(包前不包後)
		System.out.println("TreeSet當中介於6 ~ 14之間的集合 = " + tset.subSet(6, 14));
		//取出「大於等於」某特定元素的元素
		System.out.println("TreeSet當中 >= 10 的集合 = " + tset.tailSet(10));
		//取出「小於」某特定元素的元素
		System.out.println("TreeSet當中 < 8 的集合 = " + tset.headSet(8));

	}

}
