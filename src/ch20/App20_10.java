/*
 * 使用滑鼠手繪圖形
 */

package ch20;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App20_10 extends Frame
{
	static App20_10 frm = new App20_10();
	/*
	 * 宣告用來儲存座標的變數
	 * 起始座標的變數為(x1, y1)
	 * 終點座標的變數為(x2, y2)
	 */
	static int x1, x2, y1, y2;

	public static void main(String[] args) 
	{
		frm.setTitle("Free Drawing");
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
			//取得滑鼠按下時的起始座標
			x1 = e.getX();
			y1 = e.getY();
		}
	};
	
	//滑鼠拖曳時的事件處理
	static MouseMotionAdapter myMouseMotionAdapter = new MouseMotionAdapter() 
	{
		@Override
		public void mouseDragged(MouseEvent e) 
		{
			//取得繪圖區
			Graphics g = frm.getGraphics();
			
			//取得終點座標
			x2 = e.getX();
			y2 = e.getY();
			
			//畫出線條
			//引數為起始座標X,起始做標Y,終點座標X,終點座標Y
			g.drawLine(x1, y1, x2, y2);
			
			//更新起始座標，將起始座標更改為終點座標
			x1 = x2;
			y1 = y2;
			
		}
	};

}
