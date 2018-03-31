/*
 * Class Test5*/

package ch15;

class Test5 extends Thread
{
	private String id;

	public Test5(String str) 
	{
		this.id = str;
	}
	
	@Override
	public void run() 
	{
		for(int i=0; i<3; i++)
		{
			try 
			{
				//睡1秒
				sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			//印出訊息
			//getPriority()可以取得Thread的優先順序之數值
			System.out.println(id + " is running. Priority = " + this.getPriority());
		}
	}

}
