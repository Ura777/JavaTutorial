/*
 * Class Test4
 */

package ch15;

class Test4 extends Thread
{
	private String id;

	public Test4(String str) 
	{
		this.id = str;
	}
	
	@Override
	public void run() 
	{
		for(int i=0; i<4; i++)
		{
			try 
			{
				//有可能會被中斷，被中斷時會拋出InterruptedException。
				sleep((long) (1000*Math.random()));
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(id + " is running...");
		}
	}

}
