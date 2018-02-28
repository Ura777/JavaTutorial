/*
 * 遞增與遞減運算子 ++ --
 */

/*
 * 遞增，變數值+1
 * 遞減，變數值-1
 */

package ch04;

public class App4_4 
{

	public static void main(String[] args) 
	{
		int x = 10, y = 10, sum = 0;
		
		System.out.println("x = " + x + ", y = " + y + ", sum = " + sum + "\n");
		
		sum = x++;
		System.out.println("After x++, sum = " + sum + ", x = " + x);
		
		sum = ++y;
		System.out.println("After ++y, sum = " + sum + ", y = " + y);

	}

}
