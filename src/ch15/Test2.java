/*
 * Class Test2
 */

package ch15;

class Test2 extends Thread
{
	private String id;

	public Test2(String str) 
	{
		this.id = str;
	}
	
	@Override
	public void run() 
	{
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<100000000; j++)
			{
				//空迴圈，用來拖累執行速度。
			}
			System.out.println(id + " is running...");
		}
	}

}
