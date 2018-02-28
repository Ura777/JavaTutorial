/*
 * SuperClass
 */

package ch10;

class SuperShape 
{
	//Method
	public double area()
	{
		return 0.0;
	}
	
	public static void largest(SuperShape[] shapeArray)
	{
		//宣告用來存放最大面積的變數
		double largestArea = 0.0;
		
		for(int i=0; i<shapeArray.length; i++)
		{
			//判斷現在的物件的面積是否大於largestArea
			if(shapeArray[i].area() > largestArea)
			{
				largestArea = shapeArray[i].area();
			}
		}
		
		//印出結果
		System.out.println("Largest Area = " + largestArea);
	}

}
