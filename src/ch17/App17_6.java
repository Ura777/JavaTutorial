/*
 * 建立標籤物件
 * 
 * Label
 */

package ch17;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_6 
{
	static Frame frm = new Frame("Lable Class");
	//建立標籤物件
	static Label lab = new Label();

	public static void main(String[] args) 
	{
		frm.setSize(200, 150);
		frm.setBackground(Color.PINK);
		frm.setLocation(250, 250);
		
		//設定標籤上的字
		lab.setText("Hello Java!!!");
		//設定標籤的背景顏色
		lab.setBackground(Color.WHITE);
		//設定標籤的文字對齊方式
		lab.setAlignment(Label.CENTER);
		//設定標籤的文字顏色
		lab.setForeground(Color.BLUE);
		
		//宣告Font物件fnt，建構元的引數為字體名稱、字體樣式、字體大小。
		Font fnt = new Font("Serief", Font.ITALIC + Font.BOLD, 18);
		////設定標籤的字型的樣式
		lab.setFont(fnt);
		
		frm.add(lab);
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
