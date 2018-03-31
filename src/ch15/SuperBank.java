/*
 * SuperBank
 */

package ch15;

class SuperBank 
{
	//宣告儲存匯款總額的變數
	private static int importMoneyTotal = 0;

	public static void add(int importMoney) 
	{
		//宣告暫時將匯款總額儲存的變數
		int temp = importMoneyTotal;
		//累加匯款總額
		temp+=importMoney;
		
		try 
		{
			Thread.sleep((long) (1000*Math.random()));
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		//importMoneyTotal = 累加過後的匯款總額(temp)
		importMoneyTotal = temp;
		//印出匯款總額
		System.out.println("sum = " + importMoneyTotal);

	}

}
