/*
 * 同步處理 Synchronized
 * 請搭配SuperBank2、SubCustomer2。
 * 
 * 在Method前面加上關鍵字synchronized即可，
 * 此時就可以讓各Thread在時間上取得協調，
 * 1次只准許1個Thread執行add()，
 * 等這個Thread執行完add()後，
 * 下個Thread才能夠執行add()。
 * 
 * 這種機制稱為鎖定機制，
 * 如果同個物件有2條Thread，就要使用。
 * 
 * 鎖定機制有可能會造成死結(Deadlock)，
 * 由於Deadlock屬於語意錯誤，
 * 在執行時不會產生例外，
 * 因此在撰寫同步時要小心以避免發生出現Deadlock的情況。
 * 
 * 死結 Deadlock
 * 當很多Thread都需要存取某個資源時，
 * 可能會因為該資源正在被同步，
 * 導致其他的Thread正在排隊等待存取該資源，
 * 但原本正在存取該資源的Thread去遲遲不釋出該資源，
 * 造成壅塞並影響程式的執行的情況。
 * 
 * 使用關鍵字為synchronized。
 * 
 * 本範例為使用同步處理後的銀行匯款。
 */

package ch15;

public class App15_9 
{

	public static void main(String[] args) 
	{
		SubCustomer2 c1 = new SubCustomer2();
		SubCustomer2 c2 = new SubCustomer2();
		
		c1.start();
		c2.start();

	}

}
