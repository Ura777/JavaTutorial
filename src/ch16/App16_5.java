/*
 * LinkedList類別
 * 
 * 鏈結陣列(Linked List)是資料結構當中必學的主題，
 * 概念上可以想像成是一節節的車相串接在一起，
 * 而車廂稱之為「節點(Node)」。
 * 
 * 每個Node都由「資料欄」、「鏈結欄」2個欄位組成。
 * 資料欄存放資料，鏈結欄存放下個Node的位址。
 * 
 * 最後1個Node的鏈結欄會指向null，
 * 代表後面已經沒有Node了。
 * 
 * LinkedList加入或是刪除Node時，
 * 都是從起始或是結尾處去進行。
 * 
 * Elements有順序。
 */

package ch16;

import java.util.LinkedList;

public class App16_5 
{

	public static void main(String[] args) 
	{
		//宣告LinkedList物件，資料型態為Integer。
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		//加入資料
		for(int i=10; i<=30; i+=10)
		{
			linkedList.add(i);
		}
		
		//將資料加入到起始處
		linkedList.addFirst(100);
		//將資料加入到結尾處
		linkedList.addLast(200);
		linkedList.addFirst(300);
		
		//元素個數
		System.out.println("LinkedList的元素個數 = " + linkedList.size());
		
		//印出內容
		System.out.print("LinkedList的內容 = ");
		for(int i=0; i<linkedList.size(); i++)
		{
			System.out.print(linkedList.get(i) + " ");
		}
		
		//刪除最後1個元素
		System.out.println("\n刪除LinkedList最後1個元素 " + linkedList.removeLast() + "...");
		
		//第1元素
		System.out.println("LinkedList的第1個元素 = " + linkedList.getFirst());
		//最後個1元素
		System.out.println("LinkedList的最後個1元素 = " + linkedList.getLast());
		//尋找LinkedList當中是否有某特定元素，並且回傳該特定元素的Index。
		//Return -1表示沒有該元素
		System.out.println("LinkedList當中元素值為200的Index = " + linkedList.indexOf(200));

	}

}
