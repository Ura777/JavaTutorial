/*
 * 集合的特性
 * 
 * 自動排序：自動將加入的Elements進行遞增或遞減的排序。
 * 重複：是否允許存在相同的Elements。
 * 順序(次序)：Elements是否會依照放入Collection時的順序依序排列。
 * 使用關鍵值：利用關鍵值(Key)來存放Elements，
 *          1個關鍵值(Key)對照1個對應值(Value)，
 *          又可以稱為Key-Value。
 * 
 * <Set介面>
 * 是Collection的Sub Interface。
 * 
 * 有點類似數學當中的集合，Elements不能重複出現。
 * 
 * TreeSet = 自動排序 + 不可重複
 * SortedSet = 自動排序 + 不可重複
 * HashSet = 不可重複
 * LinkedHashSet = 不可重複 + 有順序
 * ==============================================
 * <List介面>
 * 是Collection的Sub Interface。
 * 
 * List是串列的意思，Elements會1個接著1個串接在一起，
 * 因此Elements有順序，也可以重複，
 * 可使用Index來存取元素。
 * 
 * ArrayList = 有順序
 * LinkedList = 有順序
 * ==============================================
 * <Map介面>
 * 不是Collection Interface的Sub Interface，
 * 而是獨立架構的Interface。
 * 
 * 利用關鍵值(Key)來存放Elements，
 * 1個關鍵值(Key)對照1個對應值(Value)，
 * 又可以稱為Key-Value。
 * 
 * 概念上來說有點像是透過身分證(Key)來得知你這個人(Value)。
 *  
 * TreeMap = 自動排序 + 使用關鍵值
 * SortedMap = 自動排序 + 使用關鍵值
 * HashMap = 使用關鍵值
 * LinkedHashMap = 有順序 + 使用關鍵值
 * Hashtable = 使用關鍵值
 * ==============================================
 * 本範例為HashSet的範例。
 * 
 * HashSet
 * 實作Set Interface，
 * 使用雜湊表(Hash Table)演算法來改善執行的效率。
 * 
 * 因為使用Hash Table Algorithm，
 * 所以每次Elements的排列順序都可能會不一樣。
 * 
 * Elements不可重複。
 */

package ch16;

import java.util.HashSet;

public class App16_3 
{

	public static void main(String[] args) 
	{
		String dog  = "Puppy";
		String cat = "Kitty";
		
		//宣告Hash物件，資料型態為String。
		HashSet<String> hset = new HashSet<>();
		//是否為空的
		System.out.println("HashSet是否為空的？" + hset.isEmpty());
		
		//加入資料
		hset.add("Monkey");
		hset.add("Bunny");
		hset.add(dog);
		hset.add(cat);
		
		//元素個數
		System.out.println("HashSet的元素個數 = " + hset.size());
		System.out.println("HashSet是否為空的？" + hset.isEmpty());
		//印出內容
		System.out.println("HashSet的內容 = " + hset);
		
		//移除元素
		hset.remove(cat);
		System.out.println("移除" + cat + "..., HashSet的元素個數 = " + hset.size());
		
		//是否包含某個元素
		System.out.println("HashSet當中是否有" + cat + "?" + hset.contains(cat));
		System.out.println("HashSet當中是否有Fish?" + hset.contains("Fish"));
		System.out.println("HashSet當中是否有Puppy?" + hset.contains("Puppy"));
		
		hset.remove("Bunny");
		System.out.println("移除Bunny..., HashSet的元素個數 = " + hset.size());
		System.out.println("HashSet的內容 = " + hset);
		
		System.out.println("清除HashSet中的所有元素...");
		//清空
		hset.clear();
		
		System.out.println("HashSet是否為空的？" + hset.isEmpty());

	}

}
