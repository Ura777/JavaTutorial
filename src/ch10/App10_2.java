/*
 * 建構元的呼叫
 * 請搭配SuperCircle2與SubCoin2
 * 
 * 執行Sub Class的建構元時，會先執行Super Class的建構元。
 * 
 * 呼叫Super Class建構元的super()，必須寫在Sub Class建構元內的第1行。
 * super()可以多載。
 * 
 * 如果Super Class中只有定義有引數的建構元，
 * 在子類別的建構元裡面又沒有用super()來呼叫Super Class中特定的建構元，
 * Compile時將會發生錯誤。
 * 
 * 要更正這種錯誤，
 * 最簡單的方法就是在Super Class內加上一個不做任何事、沒有任何引數的建構元就好。
 * 
 * this() vs. super()
 * this()可以在建構元內呼叫同一個類別內的建構元
 * super()可以從Sub Class的建構元內呼叫Super Class的建構元
 * 
 * 由於this()與super()都必須擺在建構元裡面的第1行，因此無法同時使用。
 * this()與super()皆可多載
 */

package ch10;

public class App10_2 
{

	public static void main(String[] args) 
	{
		SubCoin2 coin01 = new SubCoin2();
		coin01.show();
		
		SubCoin2 coin02 = new SubCoin2(2.5, 10);		
		coin02.show();

	}

}
