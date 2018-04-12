/*
 * 指定標籤物件大小與位置
 * 接續App17_6。
 * 
 * 在App17_6當中，由於AWT的預設版面配置(Layout)為邊界版面配置(Border Layout)，
 * 此Layout會將視窗內的單一物件放大成跟視窗相同的大小，因此導致看不到背景顏色。
 * 
 * 本範例將示範如何調整標籤物件的大小。
 */

package ch17;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_7 
{
	static Frame frm = new Frame("Lable Class");
	static Label lab = new Label();

	public static void main(String[] args) 
	{
		//取消版面配置
		frm.setLayout(null);
		frm.setSize(200, 150);
		frm.setBackground(Color.PINK);
		frm.setLocation(250, 250);
		
		lab.setText("Hello Java!!!");
		lab.setBackground(Color.WHITE);
		lab.setAlignment(Label.CENTER);
		lab.setForeground(Color.BLUE);
		//設定標籤的位置
		lab.setLocation(45, 70);
		//設定標籤的的大小
		lab.setSize(120, 20);
		//設定標籤的文字樣式
		//引數為Font的匿名物件
		lab.setFont(new Font("Serief", Font.ITALIC + Font.BOLD, 18));
			
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
