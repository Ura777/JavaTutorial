/*
 * SuperBank2
 */

package ch15;

class SuperBank2 
{
	private static int importMoneyTotal = 0;

	//加上關鍵字synchronized
	public synchronized static void add(int importMoney) 
	{
		int temp = importMoneyTotal;
		temp+=importMoney;
		
		try 
		{
			Thread.sleep((long) (1000*Math.random()));
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		importMoneyTotal = temp;
		System.out.println("sum = " + importMoneyTotal);

	}

}
