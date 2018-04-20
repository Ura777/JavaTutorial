/*
 * ActionEvent
 * 
 * 觸發情況：
 * 按下按鈕(Button)
 * 選擇表單物件(List)、功能表物件(MenuItem)
 * 文字輸入方塊(TextField)或文字輸入區塊(TextArea)按下Enter時
 * 
 * getSource可以取得事件來源的物件。
 * getModifers()可以取得事件發生時所按下的按鍵數值。
 */

package ch18;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class App18_3 extends Frame implements ActionListener
{
	static App18_3 frm = new App18_3();
	static Button btn1 = new Button("Yellow");
	static Button btn2 = new Button("Green");
	static Button btn3 = new Button("Exit");

	public static void main(String[] args) 
	{
		frm.setTitle("Aciton Event");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		frm.setLocation(250, 250);
		frm.setSize(200, 150);
		
		frm.add(btn1);
		frm.add(btn2);
		frm.add(btn3);
		
		//註冊傾聽者
		btn1.addActionListener(frm);
		btn2.addActionListener(frm);
		btn3.addActionListener(frm);
		
		btn1.addActionListener(frm);
		
		frm.setVisible(true);

	}

	//Button的事件處理
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//取得事件發生來源
		//必須強迫轉型成Button
		Button btn = (Button)e.getSource();
		
		if(btn.equals(btn1))
		{
			frm.setBackground(Color.YELLOW);
		}
		else if(btn.equals(btn2))
		{
			frm.setBackground(Color.GREEN);
		}
		else
		{
			System.exit(0);
		}
		
	}

}
