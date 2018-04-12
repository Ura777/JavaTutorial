/*
 * 指定按鈕物件的大小與位置
 * 接續App17_8。
 */

package ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_9 
{
	static Frame frm = new Frame("Button class");
	static Button btn = new Button("Click Me!!!");

	public static void main(String[] args) 
	{
		//取消版面配置
		frm.setLayout(null);
		frm.setBackground(Color.GRAY);
		frm.setSize(200, 150);
		frm.setLocation(250, 250);
		//設定按鈕的位置與大小
		//引數為位置的X、位置的Y、大小的寬、大小的高。
		btn.setBounds(50, 55, 100, 40);
		
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
