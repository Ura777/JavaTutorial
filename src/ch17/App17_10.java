/*
 * 建立選取方塊物件
 * 
 * Check Box
 * 分為單選與多選2種，單選的必須搭配CheckGroup才行。
 * 
 * 本範例為可複選的選取方塊物件。
 */

package ch17;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_10 
{
	static Frame frm = new Frame("Checkbox class");
	//建立選取方塊物件ckb1、ckb2、ckb3
	//引數為選取方塊的文字、預設狀態
	static Checkbox ckb1 = new Checkbox("Apple", true);
	static Checkbox ckb2 = new Checkbox("Banana", true);
	static Checkbox ckb3 = new Checkbox("Coconut");

	public static void main(String[] args) 
	{
		//取消版面配置
		frm.setLayout(null);
		frm.setBackground(Color.YELLOW);
		frm.setSize(250, 150);
		frm.setLocation(250, 250);
		
		//設定選取方塊物件ckb1、ckb2、ckb3的位置與大小
		ckb1.setBounds(20, 40, 140, 20);
		ckb2.setBounds(20, 60, 140, 20);
		ckb3.setBounds(20, 80, 140, 20);
		//將選取方塊物件ckb1、ckb2、ckb3加入到視窗內
		frm.add(ckb1);
		frm.add(ckb2);
		frm.add(ckb3);
		
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
