/*
 * 建立文字輸入方塊
 * 
 * TextField 
 * 用來處理當行文字，
 * 可以將輸入的文字轉換成特定的符號。
 * 
 * 設定可以容納字元個數的功能，
 * 必須要在版面配置被啟動時才有效。
 */

package ch17;

import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_12 
{
	static Frame frm = new Frame("TextField class");
	//建立文字輸入方塊物件txfd1、txfd2、txfd3
	static TextField txfd1 = new TextField("TextField Demo");
	static TextField txfd2 = new TextField("Editable");
	static TextField txfd3 = new TextField("password");

	public static void main(String[] args) 
	{
		//取消版面配置
		frm.setLayout(null);
		frm.setBackground(Color.GRAY);
		frm.setSize(250, 150);
		frm.setLocation(250, 250);
		
		//設定txfd1、txfd2、txfd3的位置與大小
		txfd1.setBounds(20, 40, 120, 20);
		txfd2.setBounds(20, 70, 120, 20);
		txfd3.setBounds(20, 100, 120, 20);
		//設定txfd1為不可以被編輯
		txfd1.setEnabled(false);
		//設定txfd3顯示的字元為「*」
		txfd3.setEchoChar('*');
		
		//將txfd1、txfd2、txfd3加入到視窗
		frm.add(txfd1);
		frm.add(txfd2);
		frm.add(txfd3);
		
		frm.setVisible(true);
				
		frm.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});
		
		//顯示txfd1、txfd2、txfd3的內容
		System.out.println("txfd1.Text = " + txfd1.getText());
		System.out.println("txfd2.Text = " + txfd2.getText());
		System.out.println("txfd3.Text = " + txfd3.getText());

	}
}
