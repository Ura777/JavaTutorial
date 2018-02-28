/*
 * SubClass
 */

package ch10;

class SubCbb extends SuperCaa 
{
	int num = 10;
	
	//Method
	public void show()
	{
		super.num = 20;  //設定SuperCaa的num
		System.out.println("SubCbb_num = " + num);
		super.show();  //呼叫SuperCaa的show()
	}

}
