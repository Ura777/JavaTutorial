/*
 * 繪製基本的幾何圖形
 */

package ch20;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App20_8 extends Frame
{
	static App20_8 frm = new App20_8();

	public static void main(String[] args) 
	{
		frm.setTitle("Arc & Oval");
		frm.setLocation(250, 250);
		frm.setSize(200, 150);
		frm.setBackground(Color.PINK);

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

	@Override
	public void paint(Graphics g) 
	{
		g.setColor(Color.YELLOW);
		//繪製弧形圖案
		//引數為X座標,Y座標,寬度,高度,起始角度,結束角度
		g.fillArc(20, 50, 70, 70, 30, 300);
		
		g.setColor(Color.RED);
		for(int x = 70; x<=170; x=x+20)
		{
			//繪製橢圓形
			//引數為X座標,Y座標,寬度,高度
			g.fillOval(x, 80, 10, 10);
		}
	}
}
