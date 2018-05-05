/*
 * 功能表
 * 
 * 由MenuBar、Menu、MenuItem組成。
 * 
 * 繼承關係如下：
 * lang.Object -> awt.MenuComponet -> awt.MenuBar
 * 								   -> awt.MenuItem -> Menu
 * 
 * 加入順序如下：
 * MenuItem加入至Menu，Menu加入至MenuBar。
 */

package ch19;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App19_5
{
	static Frame frm = new Frame("Menu Demo");
	//宣告MenuBar物件mb
	static MenuBar mb = new MenuBar();
	//宣告Menu物件menu01、menu02
	static Menu menu01 = new Menu("Color");
	static Menu menu02 = new Menu("Exit");
	//宣告MenuItem物件mi01 ~ mi04
	static MenuItem mi01 = new MenuItem("Yellow");
	static MenuItem mi02 = new MenuItem("Orange");
	static MenuItem mi03 = new MenuItem("Pink");
	static MenuItem mi04 = new MenuItem("Close Window");

	public static void main(String[] args) 
	{
		frm.setLocation(250, 250);
		frm.setSize(200, 150);
		
		//將mi01 ~ mi03加入到menu01
		menu01.add(mi01);
		menu01.add(mi02);
		menu01.add(mi03);
		//將menu01加入到mb
		mb.add(menu01);
		
		//將mi04加入到menu02
		menu02.add(mi04);
		//將menu02加入到mb
		mb.add(menu02);
		
		//將frm的功能表設定為mb
		frm.setMenuBar(mb);
		
		frm.setVisible(true);
		
		frm.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				frm.dispose();
			}
		});

	}

}
