/*
 * 多層版面配置
 * 
 * Card Layout
 * 把每個物件都視為1個圖層，每個物件都會佈滿整個視窗。
 * 如果想要在在同1層放置多個物件，可以搭配面板(Panel)。
 */

package ch17;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_15 
{
	static Frame frm = new Frame("Card Layout");

	public static void main(String[] args) 
	{
		//產生多層版面配置物件card
		//引數為水平間距、垂直間距
		CardLayout card = new CardLayout(5, 10);
		//設定視窗的版面配置
		frm.setLayout(card);
		
		frm.setBackground(Color.GRAY);
		frm.setSize(250, 150);
		frm.setLocation(250, 250);
		
		//將按鈕加入到視窗內，給予名稱(name)。
		//引數為元件、限制配置的方式
		frm.add(new Button("Button01"), "Card01");
		frm.add(new Button("Button02"), "Card02");
		frm.add(new Button("Button03"), "Card03");
		//顯示視窗中指定名稱的物件
		//引數為容器、物件名稱
		card.show(frm, "Card02");
		
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
