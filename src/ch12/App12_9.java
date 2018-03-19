/*
 * Math類別
 * 
 * Method皆屬於Class Method，
 * Variable皆屬於Class Variable，
 * 因此不必產生物件即可使用。
 */

package ch12;

public class App12_9 
{

	public static void main(String[] args) 
	{
		//歐拉常數，又稱為自然常數。
		System.out.println("自然常數 = " + Math.E);
		
		//圓周率
		System.out.println("圓周率 = " + Math.PI);
		
		//三角函數-正弦函數
		//sin(90°)
		System.out.println("sin(90°) = " + Math.sin(Math.PI/2));
		
		//自然指數函數
		//e^x = Y
		System.out.println("e³ = " + Math.exp(3));
		
		//自然對數函數
		//logₑY = x
		System.out.println("logₑ20.085536923187668 = " + Math.log(20.085536923187668));
		
		//開根號
		//√100
		System.out.println("√100 = " + Math.sqrt(100));
		
		//大於該數的最小整數
		System.out.println("大於9.5的最小整數 = " + Math.ceil(9.5));
		
		//小於該數的最大整數
		System.out.println("小於21.9的最大整數 = " + Math.floor(21.9));
		
		//a的b次方
		System.out.println("2¹⁶ = " + Math.pow(2, 16));
		
		//最接近該數的整數
		//在Java當中可以當成是小數點後面四捨五入
		System.out.println("最接近9.4的整數 = " + Math.round(9.4));
		System.out.println("最接近9.5的整數 = " + Math.round(9.5));
		
		//亂數，範圍是0.0~1.0。
		System.out.println("亂數 = " + Math.random());
		
		//絕對值
		System.out.println("|-20| = " + Math.abs(-20));
		
		//最大值
		System.out.println("10與20誰比較大? " + Math.max(10, 20));
		
		//最小值
		System.out.println("10與20誰比較小? " + Math.min(10, 20));
	
	}

}
