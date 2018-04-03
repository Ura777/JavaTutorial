/*
 * ArrayList類別
 * 
 * 可以視為動態Array，自行調整Array的大小。
 * 
 * 使用Index來存取元素。
 * 
 * Elements有順序。
 */

package ch16;

import java.util.ArrayList;

public class App16_6 
{

	public static void main(String[] args) 
	{
		//宣告ArrayList物件，資料型態為Integer。
		ArrayList<Integer> alist = new ArrayList<>();
		
		//加入資料
		for(int i=10; i<=50; i+=10)
		{
			alist.add(i);
		}
		
		//在指定的Index位置中加入資料
		alist.add(3, 200);
		alist.add(0, 300);
		alist.add(400);
		
		//元素個數
		System.out.println("ArrayList的元素個數 = " + alist.size());
		//印出內容
		System.out.println("ArrayList的內容 = " + alist);
		
		System.out.println("將ArrayList當中Index = 1 的元素以 200 取代... ");
		//將指定的Index位置的元素值給取代成某個特定的元素值
		alist.set(1, 200);
		System.out.println("ArrayList的內容 = " + alist);
		
		//第1個特定元素值的Index
		System.out.println("ArrayList中第1個元素值為 200 的 Index = " + alist.indexOf(200));
		//最後1個特定元素值的Index
		System.out.println("ArrayList中最後1個元素值為 200 的 Index = " + alist.lastIndexOf(200));

	}

}
