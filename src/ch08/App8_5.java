/*
 * Data Member於RAM當中的配置關係
 * 
 * 請搭配Class Circle
 */

package ch08;

public class App8_5 
{

	public static void main(String[] args) 
	{
		Circle circle01 = new Circle();
		Circle circle02 = new Circle();
		
		//設定circle01與circle02的半徑
		circle01.radius = circle02.radius = 2.0;
		
		//修改circle02的半徑為3.0
		circle02.pi = 3.0;
		
		circle01.show_area();
		System.out.println();
		circle02.show_area();

	}

}
