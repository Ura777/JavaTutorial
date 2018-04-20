/*
 * 定義內部類別並產生匿名物件當成傾聽者
 * 
 * 由於是利用內部類別來實作介面ActionListener，
 * 因此不必App18_2不需要實作介面ActionListener。
 * 
 * 事件的分類
 * 1.語意事件(Semantic Events)
 *   直接繼承自AWTEvent類別，例如：ActionEvent。
 *   
 * 2.低階層事件(Low-Level Events)
 *   繼承自ComponentEvent類別，例如：WindowEvent。
 */

package ch18;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App18_2
{
	static Frame frm = new Frame("Action Event");
	static Button btn = new Button("Click Me");
	
	//定義內部類別ActLis，並且實作介面ActionListener。
	static class ActLis implements ActionListener
	{
		//事件發生的處理動作
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			frm.setBackground(Color.YELLOW);
		}
	}

	public static void main(String[] args) 
	{
		frm.setLayout(new FlowLayout());
		frm.setLocation(250, 250);
		frm.setSize(200, 150);
		frm.add(btn);
		
		//傾聽者為內部類別ActLis的匿名物件
		btn.addActionListener(new ActLis());
		
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
