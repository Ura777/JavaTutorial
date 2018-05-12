/*
 * 請接續App20_2的範例。
 * 
 * 要如何讓按下按鈕後才會出現長方形，而不是視窗一出現就自動畫好長方形？
 * 只要用boolean變數來判斷按鈕是否被按下，就能解決此問題。
 */

package ch20;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App20_3 extends Frame implements ActionListener
{
	static App20_3 frm = new App20_3();
	static Button btn = new Button("Draw");
	//宣告boolean變數btnIsClicked，用來判斷按鈕是否被按下。
	boolean btnIsClicked = false;

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		BorderLayout br = new BorderLayout();
		frm.setTitle("Drawing Demo");
		frm.setLayout(br);
		frm.setLocation(250, 250);
		frm.setSize(300, 150);
		
		btn.addActionListener(frm);
		
		frm.add(btn,br.SOUTH);
		frm.setVisible(true);
		
		frm.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				frm.dispose();
			}
		});

	}

	//btn的事件處理
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//將false改為true，代表按鈕被按下。
		btnIsClicked = true;
		Graphics g = getGraphics();
		paint(g);
	}
	
	//畫出長方形
	@Override
	public void paint(Graphics g) 
	{
		//如果按鈕被按下，就要畫出長方形
		if (btnIsClicked)
		{
			g.drawRect(100, 50, 70, 55);
		}
	}

}
