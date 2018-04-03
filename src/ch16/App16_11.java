/*
 * ListIterator
 * 
 * 可以雙向走訪Elements。
 * 
 * 只要呼叫List Interface中的listIterator()，
 * 就可以取得ListIterator物件。
 */

package ch16;

import java.util.LinkedList;
import java.util.ListIterator;

public class App16_11 
{

	public static void main(String[] args) 
	{
		//宣告LinkedList物件，資料型態為String。
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(7);
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
			
		System.out.print("正向列出LinkedList的內容：");
		//取得Iterator物件，資料型態必須與LinkedList物件的資料型態相同。
		ListIterator<Integer> itrList = linkedList.listIterator();
		//如果還有下1個元素，就代表還有元素可以走訪。
		while(itrList.hasNext())
		{
			//印出下1個元素
			System.out.print(itrList.next() + " ");
		}
		System.out.println();
		
		System.out.print("反向列出LinkedList的內容：");
		//取得Iterator物件，資料型態必須與LinkedList物件的資料型態相同。
		//由於傳入了LinkedList的元素個數，因此下1個元素的Index會是4。
		ListIterator<Integer> itrList2 = linkedList.listIterator(linkedList.size());
		//如果還有上1個元素，就代表還有元素可以走訪。
		while(itrList2.hasPrevious())
		{
			//印出上1個元素
			System.out.print(itrList2.previous() + " ");
		}
		System.out.println();

	}

}
