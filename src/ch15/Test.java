/*
 * Class Test
 */

package ch15;

class Test 
{
	private String id;

	public Test(String str) 
	{
		this.id = str;
	}
	
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
