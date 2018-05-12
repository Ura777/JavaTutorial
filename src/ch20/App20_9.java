/*
 * 繪製多邊形
 */

package ch20;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App20_9 extends Frame
{
	static App20_9 frm = new App20_9();

	public static void main(String[] args) 
	{
		frm.setTitle("Polygon");
		frm.setLocation(250, 250);
		frm.setSize(200, 150);

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
		//儲存所有頂點的X軸座標陣列
		int x[] = {44,65,97,139,58};
		//儲存所有頂點的Y軸座標陣列
		int y[] = {34,55,40,109,127};
		
		g.setColor(Color.PINK);
		//畫出填滿顏色的多邊形
		//引數為X座標陣列,Y座標陣列,頂點個數
		g.fillPolygon(x, y, 5);
		
		g.setColor(Color.BLACK);
		//畫出只有邊框的多邊形
		//引數為X座標陣列,Y座標陣列,頂點個數
		g.drawPolygon(x, y, 5);
	}
}
