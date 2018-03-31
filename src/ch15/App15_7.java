/*
 * 執行緒的優先順序
 * 請搭配Test5。
 * 
 * 在Windows中，是透過分時多工(Time Division Multiplex)的方式來處理Thread的執行。
 * 
 * 分時多工 Time Division Multiplex
 * 將CPU時間切細，平均分給所有的Thread。
 * 若是某Thread有優先順序，就會執行優先順序較高的，
 * 讓人以為電腦是同時做很多事情，達到多工的效果。
 * 
 * 在Java中，優先順序是由整數數字1~10來表示，
 * 數字越大代表優先權越高。
 * 
 * Java也提供3個優先權常數：
 * MAX_PRIORITY是最大優先順序的數值。
 * MIN_PRIORITY是最小優先順序的數值。
 * NORM_PRIORITY是系統預設的優先順序數值。 
 */

package ch15;

public class App15_7 
{

	public static void main(String[] args) 
	{
		Test5 dog = new Test5("Doggy");
		Test5 cat = new Test5("Kitty");
		Test5 rabbit = new Test5("Bunny");
		Test5 sheep = new Test5("Sheep");
		Test5 horse = new Test5("Horse");
		
		//設定優先順序的數值
		cat.setPriority(Thread.MAX_PRIORITY);
		dog.setPriority(Thread.MIN_PRIORITY);
		rabbit.setPriority(7);
		horse.setPriority(3);
		
		dog.start();
		cat.start();
		rabbit.start();
		sheep.start();
		horse.start();
	}

}
