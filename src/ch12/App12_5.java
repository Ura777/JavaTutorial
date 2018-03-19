/*
 * package的階層關係
 * 請搭配pack02.circle.Circle、pack02.rectangle.Rectangle
 * 
 * package可以依照功能劃分成數個子package(sub-package)。
 * 
 * 此範例是依照物體的形狀區分成圓形與正方形，
 * 硬幣屬於package circle，
 * 相機屬於package rectangle。
 */

package ch12;

import pack02.circle.Coin;
import pack02.rectangle.Camera;

public class App12_5 
{

	public static void main(String[] args) 
	{
		Coin coin = new Coin();
		coin.show();
		
		Camera camera = new Camera();
		camera.show();

	}

}
