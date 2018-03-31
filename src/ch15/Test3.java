/*
 * Class Test3
 */

package ch15;

class Test3 implements Runnable
{
	private String id;

	public Test3(String str) 
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
