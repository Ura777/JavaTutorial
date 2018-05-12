/*
 * 座標系統 Coordinate System
 * 在Java中，向右為X軸正方向，像下為Y軸正方向。
 * 
 * Graphics類別
 * 該類別所產生的物件稱之為圖形內容(Graphics Context)。
 * 
 * 圖形內容(Graphics Context)
 * 可以將之想像成畫布，而且不需要透過Graphics類別的建構元來建立，
 * 只要透過Component類別的getGraphics()即可。
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
public class App20_1 extends Frame implements ActionListener
{
	static App20_1 frm = new App20_1();
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
		//畫出長方形
		//引數為X座標,Y座標,寬度,高度
		g.drawRect(100, 50, 70, 55);
		
	}

}
