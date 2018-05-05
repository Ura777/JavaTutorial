/*
 * 功能表的事件處理
 * 
 * 觸發事件：ActionEvent
 * 傾聽介面：ActionListenter
 * 實作方法：actionPerformed()
 */

package ch19;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App19_6 extends Frame implements ActionListener
{
	static App19_6 frm = new App19_6();
	//宣告Label物件lab
	//引數為標籤預設文字,文字對齊方式
	static Label lab = new Label("Tastes differ.", Label.CENTER);
	//宣告MenuBar物件mb
	static MenuBar mb = new MenuBar();
	//宣告Menu物件menu01、menu02
	static Menu menu01 = new Menu("Style");
	static Menu menu02 = new Menu("Exit");
	//宣告MenuItem物件mi01 ~ mi04
	static MenuItem mi01 = new MenuItem("Plane");
	static MenuItem mi02 = new MenuItem("Bold");
	static MenuItem mi03 = new MenuItem("Italic");
	static MenuItem mi04 = new MenuItem("Close Window");

	public static void main(String[] args) 
	{
		frm.setTitle("Menu Demo");
		frm.setLocation(250, 250);
		frm.setSize(300, 150);
		
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
		
		//註冊mi01 ~ mi04的傾聽者為frm
		mi01.addActionListener(frm);
		mi02.addActionListener(frm);
		mi03.addActionListener(frm);
		mi04.addActionListener(frm);
		
		//將frm的功能表設定為mb
		frm.setMenuBar(mb);
		
		frm.add(lab);
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

	//mi01 ~ mi04的事件處理
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//取得觸發事件的物件
		MenuItem mi = (MenuItem)e.getSource();
		
		if(mi.equals(mi01))
		{
			//設定標籤文字的字型設定
			//引數為字型名稱,字體樣式,字體大小
			lab.setFont(new Font("Dialog", Font.PLAIN, 24));
		}
		if(mi.equals(mi02))
		{
			lab.setFont(new Font("Dialog", Font.BOLD, 24));
		}
		if(mi.equals(mi03))
		{
			lab.setFont(new Font("Dialog", Font.ITALIC, 24));
		}
		if(mi.equals(mi04))
		{
			frm.dispose();
		}
		
	}

}
