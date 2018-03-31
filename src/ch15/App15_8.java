/*
 * 同步處理 Synchronized
 * 請搭配SuperBank、SubCustomer。
 * 
 * 當程式開很多條執行緒但卻共用1個變數時，
 * 如果沒有使用同步處理，就很容易發生錯誤。
 * 
 * 本範例是模擬銀行的匯款，每匯款1次，便會計算匯款的總額。
 * 
 * 假設現在有2名顧客，以每人都分3次、每次100元的方式將錢匯入。
 * 因此，最後銀行的匯款總額將會是600元。
 * 
 * 本範例沒有經過同步處理。
 */

package ch15;

public class App15_8 
{

	public static void main(String[] args) 
	{
		SubCustomer c1 = new SubCustomer();
		SubCustomer c2 = new SubCustomer();
		
		c1.start();
		c2.start();
	}

}
