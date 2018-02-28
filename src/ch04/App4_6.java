/*
 * 簡潔運算式 += -= *= /= %=
 */

/*
 * a+=b 與 a=a+b 相同
 * a-=b 與 a=a-b 相同
 * a*=b 與 a=a*b 相同
 * a/=b 與 a=a/b 相同
 * a%=b 與 a=a%b 相同
 */

package ch04;

public class App4_6 
{

	public static void main(String[] args) 
	{
		int x = 10, y = 20;
		
		System.out.println("x = " + x + ", y = " + y + "\n");
		System.out.println("x+=y：" + (x+=y));

	}

}
