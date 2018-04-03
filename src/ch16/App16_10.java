/*
 * Iterator介面
 * 
 * 適用於不是Map的Collection，
 * 可以走訪以及刪除最後1個Elements。
 * 
 * 只能夠從起始處開始走訪。
 * 
 * 由於Collection、List、Set都已經實作Iterator，
 * 因此透過iterator()即可取得Iterator物件。
 */

package ch16;

import java.util.Iterator;
import java.util.TreeSet;

public class App16_10 
{
	public static void main(String[] args) 
	{
		String animal = "";
		//宣告TreeSet物件，資料型態為String。
		TreeSet<String> zoo = new TreeSet<>();
		
		zoo.add("Monkey");
		zoo.add("Bunny");
		zoo.add("Puppy");
		zoo.add("Kitty");

		System.out.print("TreeSet的內容 = ");
		//取得Iterator物件，資料型態必須與TreeSet物件的資料型態相同。
		Iterator<String> itr = zoo.iterator();
		//如果還有下1個元素，就代表還有元素可以走訪。
		while(itr.hasNext())
		{
			//取得下1個元素
			animal = itr.next();
			System.out.print(animal + " ");
		}
		
		System.out.println("\n刪除TreeSet中的最後1個元素" + animal + "...");
		itr.remove();
		
		System.out.println("TreeSet的內容 = " + zoo);
		
	}

}
