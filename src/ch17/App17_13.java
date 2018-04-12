/*
 * 建立文字輸入區域物件
 * 
 * TextArea
 * 可以看成是二維的TextField，用來處理多行文字。
 * 搭配捲軸(Scroll Bars)使用，可以讓使用方便瀏覽其他部分的文字。
 * 
 * 依照字元數設定寬、高，必須要在啟動某些版面配置(流動版面配置，Flow Layout)的前提下才有用。
 * 第25行的8與14基本上是沒有用的，填上只不過是為了要滿足建構元的條件。
 * 基本上，本範例的大小的設置為第36行
 */

package ch17;

import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_13 
{
	static Frame frm = new Frame("TextArea class");
	//建立文字輸入區域物件txar
	//引數為預設文字、大小(行)(寬)、大小(列)(高)、捲軸的顯示方式
	static TextArea txar = new TextArea("demo", 8, 14, TextArea.SCROLLBARS_VERTICAL_ONLY);
	

	public static void main(String[] args) 
	{
		//取消版面配置
		frm.setLayout(null);
		frm.setBackground(Color.GRAY);
		frm.setSize(250, 150);
		frm.setLocation(250, 250);
		
		//設定txar的位置與大小
		txar.setBounds(30, 45, 140, 80);
		//將txar加入到視窗
		frm.add(txar);
		
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
