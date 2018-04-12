/*
 * 建立按鈕物件
 * 
 * Button
 */

package ch17;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_8 
{
	static Frame frm = new Frame("Button class");
	//產生按鈕物件btn
	static Button btn = new Button("Click Me!!!");

	public static void main(String[] args) 
	{
		frm.setSize(200, 150);
		frm.setLocation(250, 250);
		//將btn加入到視窗
		frm.add(btn);
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
