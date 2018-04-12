/*
 * 流動式版面配置
 * 
 * Flow Layout
 * 可以自動依照視窗的大小，將物件由左而右、由上而下依序排列。
 */

package ch17;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_16 
{
	static Frame frm = new Frame("Card Layout");

	public static void main(String[] args) 
	{
		//產生流動式版面配置物件flow
		//引數為對齊方式、水平間距、垂直間距
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 5, 10);
		//設定視窗的版面配置
		frm.setLayout(flow);
		
		frm.setBackground(Color.GRAY);
		frm.setSize(250, 150);
		frm.setLocation(250, 250);
		
		//將文字輸入方塊加入到視窗內。
		//文字輸入方塊的引數為預設文字、n個字元數的大小
		frm.add(new TextField("This", 8));
		frm.add(new TextField("is", 6));
		frm.add(new TextField("Flow Layout", 16));

		
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
