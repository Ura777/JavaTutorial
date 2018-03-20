package ch13;

class Circle 
{
	//Data Member
	private double radius;

	//Method
	//指定Method拋出Exception
	public void setRadius(double r) throws CircleException
	{
		if(r > 0)
		{
			this.radius = r;
		}
		else
		{
			//在程式中拋出Exception
			throw new CircleException();
		}
	}
	
	public void show()
	{
		System.out.println("area = " + Math.PI * Math.pow(radius, 2));
	}
	
	

}
