package ch13;
/*
 * CircleException Class
 */

@SuppressWarnings("serial")
class CircleException extends Exception
{
	//Override getMessage()
	@Override
	public String getMessage() 
	{
		return "半徑必須要大於0！";
	}
	
	
}
