/*
 * 介面的延伸
 * 請搭配ISuperShape、ISubShape2D、Circle03
 * 
 * 與Class一樣，可以透過繼承來衍生出新的Interface。
 * 原來的介面稱為基底介面(Basic Interface)或是父介面(Super Interface)，
 * 衍生出的介面稱為衍生介面(Derived Interface)或是子介面(Sub Interface)。
 * 
 * 透過繼承的方式，Sub Interface不但保有Sub Interface的成員，
 * 也可以根據實際的狀況來加入新成員，已達到解決問題的目的。
 * 
 * 介面繼承的關鍵字為extends。
 * 
 * 與Class不同的是，Interface可以繼承自多個Interface。
 */

package ch11;

public class App11_7 
{

	public static void main(String[] args) 
	{
		Circle03 circle = new Circle03(2.0);
		circle.setColor("Red");
		circle.area();

	}

}
