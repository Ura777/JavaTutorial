/*
 * 泛型 Generic
 * 請搭配Member。
 * 
 * 泛型技術是利用一個通用的型態來代表所有可能的型態，
 * 只需針對這個通用型態來撰寫相對應的Data Member與Function Member。
 * 泛型技術可以說是與Collection息息相關。
 * 
 * 使用<T>來代表通用型態。
 * 
 * <T>的型態必須是Wrapper Class的資料型態。
 */

package ch16;

public class App16_2 
{

	public static void main(String[] args) 
	{
		Member<Integer> memberInt = new Member<>();
		Member<String> memberStr = new Member<>();
		
		memberInt.setId(10);
		memberStr.setId("Ivan");
		
		memberInt.show();
		memberStr.show();

	}

}
