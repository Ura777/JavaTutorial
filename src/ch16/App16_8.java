/*
 * TreeMap類別
 * 
 * 實作SortedMap Interface。
 * 
 * Key必須是唯一存在，且不能為null。
 * Value可以重複。
 * 
 * Elements使用關鍵值 + 會依照Key由小到大排序 + Value可以重複。*/

package ch16;

import java.util.TreeMap;

public class App16_8 
{

	public static void main(String[] args) 
	{
		int key1 = 94001, key2 = 94003;
		TreeMap<Integer, String> tmap = new TreeMap<>();
		
		tmap.put(94001, "Alan");
		tmap.put(94002, "Ivan");
		tmap.put(94003, "Ryan");
		tmap.put(94004, "Jack");
		
		System.out.println("TreeMap的元素個數 = " + tmap.size());
		System.out.println("TreeMap的內容 = " + tmap);
		System.out.println("TreeMap當中的第1個元素 = " + tmap.firstKey() + ", " + tmap.get(tmap.firstKey()));
		System.out.println("TreeMap當中的最後1個元素 = " + tmap.lastKey() + ", " + tmap.get(tmap.lastKey()));
		System.out.println("TreeMap當中Key介於" + key1 + "與 " + key2 + "之間的TreeMap = " + tmap.subMap(key1, key2));
		System.out.println("TreeMap當中Key大於等於" + key2 + "的TreeMap = " + tmap.tailMap(key2));
		
		
	}

}
