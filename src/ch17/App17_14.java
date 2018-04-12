/*
 * 版面配置
 * 
 * Layout
 * 指視窗內的物件會依照一定的規則來排版，均繼承自Object類別。
 * 
 * 邊界版面配置 Border Layout
 * 將物件配置在視窗的邊界，例如捲軸物件。
 * 物件會依照視窗大小自動變更長寬，因此物件無法使用setSize()。
 * 
 * 本範例為Border Layout。
 */

package ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_14 
{
	static Frame frm = new Frame("Border Layout");

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		//產生邊界版面配置物件border
		//引數為水平間距、垂直間距
		BorderLayout border = new BorderLayout(2, 5);
		//設定視窗的版面配置
		frm.setLayout(border);
		
		frm.setBackground(Color.GRAY);
		frm.setSize(250, 150);
		frm.setLocation(250, 250);
		
		//將按鈕加入到視窗內
		//引數為元件、限制配置的方式
		frm.add(new Button("East"), border.EAST);
		frm.add(new Button("West"), border.WEST);
		frm.add(new Button("South"), border.SOUTH);
		frm.add(new Button("North"), border.NORTH);
		frm.add(new Button("Center"), border.CENTER);
		
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
