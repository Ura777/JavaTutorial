/*
 * SubCustomer2
 */

package ch15;

class SubCustomer2 extends Thread
{
	@Override
	public void run() 
	{
		//分3次，每次存100元。
		for(int i=1; i<=3; i++)
		{
			SuperBank2.add(100);
		}
	}

}
