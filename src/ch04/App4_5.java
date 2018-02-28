/*
 * 邏輯運算子 && ||
 */

/*
 * And，且。
 * Or，或是。
 */

package ch04;

public class App4_5 
{

	public static void main(String[] args) 
	{
		int score = 53;
		
		if ((score < 0 ) || (score > 100))
			System.out.println("Score is not correct!!!");
		
		if ((score < 60 ) || (score > 49))
			System.out.println("Make up Exam!!!");

	}

}
