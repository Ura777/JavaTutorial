/*
 * 改寫 Overriding
 * 請搭配SuperCircle4與SubCoin4
 * 
 * Overriding與多載(Overloading)皆屬於Java當中的多型(Polymorphism)
 * 
 * Polymorphism的原意是多樣性，
 * 而多型的特性就是函數在不同的情況下可以扮演不同的角色。
 * 
 * 利用Overriding，
 * 在Sub Class中可以定義與Super Class內名稱、引數個數、資料型態完全相同的Method，
 * 用來取代Super Class內原有的Method。
 * 
 * Overriding的技術便利於發展大型程式
 * 
 * 如果希望Super Class的Method不要被Sub Class Overriding，
 * 可以在Super Class的Method前方加上final。
 * 
 * Class前面加上final後，不能被繼承。
 */

package ch10;

public class App10_4 
{

	public static void main(String[] args) 
	{
		
		SubCoin4 coin = new SubCoin4(2.0, 10);
		coin.show();

	}

}
