/*
 * 一元運算子 + - ! ~
 */

/*
 * Unary operator
 * 正號
 * 負號
 * NOT，否定。
 * 取1的補數
 */

package ch04;

public class App4_2 
{

	public static void main(String[] args) 
	{
		byte x = Byte.MIN_VALUE;
		boolean y = true;
		
		System.out.println("x = " + x + ", ~x = " + (~x));
		System.out.println("y = " + y + ", !y = " + (!y));

	}

}
