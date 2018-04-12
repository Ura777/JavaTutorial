/*
 * 簡單的AWT範例-4
 * 
 * 接續App17_3，讓App17_4繼承自Frame類別，
 * 利用App17_4某個特定的建構元產生Frame物件。
 */

package ch17;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App17_4 extends Frame
{
	Label lab = new Label("Hello Java!!!");
	
	//Constructor
	public App17_4(String title)
	{
		//呼叫Frame的建構元建立視窗物件，並將視窗標題設定為傳入的字串。
		//相當於呼叫了Frame("My First AWT Program")
		super(title);
		//將標籤物件lab加入到視窗
		add(lab);
	}

	public static void main(String[] args) 
	{
		//呼叫App17_4的建構元
		App17_4 frm = new App17_4("My First AWT Program");
		
		frm.setSize(270, 150);
		frm.setBackground(Color.YELLOW);
		frm.setLocation(250, 250);
		frm.setVisible(true);
				
		frm.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});

	}

}
