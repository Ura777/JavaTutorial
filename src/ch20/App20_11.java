/*
 * 用滑鼠移動圖形
 * 
 * 概念是不斷擦掉圖形與重繪圖形這兩個動作。
 */

package ch20;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App20_11 extends Frame
{
	static App20_11 frm = new App20_11();
	/*
	 * 新的基準點(圖形的左上角)座標為(x, y)
	 * 基準點(圖形的左上角)座標為(posX, posY)
	 * 滑鼠按下時的座標與基準點座標的X軸距離為dx
	 * 滑鼠按下時的座標與基準點座標的Y軸距離為dy
	 */
	static int x=70, y=60, posX=70, posY=60, dx, dy;

	public static void main(String[] args) 
	{
		frm.setTitle("Dragging a Circle");
		frm.setLocation(250, 250);
		frm.setSize(250, 150);
		
		//註冊傾聽者為MouseAdapter物件myMouseAdapter
		frm.addMouseListener(myMouseAdapter);
		//註冊傾聽者為MouseMotionAdapter物件myMouseMotionAdapter
		frm.addMouseMotionListener(myMouseMotionAdapter);

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
	
	//滑鼠按下時的事件處理
	static MouseAdapter myMouseAdapter = new MouseAdapter() 
	{
		@Override
		public void mousePressed(MouseEvent e) 
		{
			//取得滑鼠按下時的座標與基準點座標之間X、Y軸距離
			dx = e.getX() - posX;
			dy = e.getY() - posY;
		}
	};
	
	//滑鼠拖曳時的事件處理
	static MouseMotionAdapter myMouseMotionAdapter = new MouseMotionAdapter() 
	{
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			//取得拖曳時的新基準點座標
			x = e.getX() - dx;
			y = e.getY() - dy;
			
			//如果滑鼠指標落在正方型區域內
			//數值為1~49是因為圖形的寬、高皆為50。
			if(dx>0 && dx<50 && dy>0 && dy<50)
			{
				//取得繪圖區
				Graphics g = frm.getGraphics();
				//清空畫面只剩下背景顏色，再呼叫paint()。
				frm.update(g);
			}
		}
	};
	
	@Override
	public void paint(Graphics g) 
	{
		g.setColor(Color.PINK);
		g.fillOval(x, y, 50, 50);
		//更新基準點座標
		posX = x;
		posY = x;
	}

}
