/*
 * 2 Parameters and Return
 */

package ch07;

public class App7_3 
{

	public static void main(String[] args) 
	{
		double num = 0;
		
		num = show_length(8, 4); //呼叫show_length()，參數為8與4。
		System.out.println("長方形的對角線長度 = " + num);

	}
	
	//計算對角線長度的方法
	public static double show_length(int lengh, int width)
	{
		return Math.sqrt(lengh*lengh + width*width);
	}

}
