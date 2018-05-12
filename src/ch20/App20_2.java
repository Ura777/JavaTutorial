/*
 * 請接續App20_1的範例。
 * 
 * 如何解決圖形被覆蓋掉的問題？
 * 利用paint()即可。
 * 
 * paint()方法
 * 此方法為自發性的(Spontaneous)的方法，碰到下列的情況時Java會自動去執行：
 * 1.新建立的視窗顯示於螢幕上、從隱藏變成顯示時。
 * 2.從縮小的狀態還原之後。
 * 3.改變視窗大小的時候。
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
public class App20_2 extends Frame implements ActionListener
{
	static App20_2 frm = new App20_2();
	static Button btn = new Button("Draw");

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
		//取得視窗的繪圖區
		Graphics g = getGraphics();
		//呼叫paint()
		paint(g);
	}
	
	//畫出長方形
	@Override
	public void paint(Graphics g) 
	{
		//畫出長方形
		//引數為X座標,Y座標,寬度,高度
		g.drawRect(100, 50, 70, 55);
	}

}
