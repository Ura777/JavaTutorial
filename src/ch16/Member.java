package ch16;

//在Class名稱後方<T>即可定義成泛型Class
class Member<T>
{
	//所有的資料型態皆用T來代替宣告
	//Data Member
	private T id;
	
	//Function Member
	public void setId(T value)
	{
		this.id = value;
	}
	
	public void show()
	{
		System.out.println("ID = " + this.id);
	}
}
