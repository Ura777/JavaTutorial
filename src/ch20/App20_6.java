/*
 * brighter()與darker()的範例
 */

package ch20;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App20_6 extends Frame implements ActionListener
{
	static App20_6 frm = new App20_6();
	static Button btnBrighter = new Button("Brighter");
	static Button btnDarker = new Button("Darker");
	//設定顏色的初始值為白色
	Color myColor = new Color(255, 255, 255);

	public static void main(String[] args) 
	{
		frm.setTitle("Brighter & Darker");
		frm.setLayout(new FlowLayout());
		frm.setLocation(250, 250);
		frm.setSize(300, 150);
		
		btnBrighter.addActionListener(frm);
		btnDarker.addActionListener(frm);
		
		frm.add(btnBrighter);
		frm.add(btnDarker);
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

	//按鈕的事件處理
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//取得被按下的按鈕
		Button btn = (Button)e.getSource();
		
		if(btn.equals(btnBrighter))
		{
			//將顏色變亮
			myColor = myColor.brighter();
		}
		if(btn.equals(btnDarker))
		{
			//將顏色變暗
			myColor = myColor.darker();
		}
		
		Graphics g = getGraphics();
		paint(g);
	}
	
	//填滿顏色
	@Override
	public void paint(Graphics g) 
	{
		g.setColor(myColor);
		g.fillRect(0, 0, getWidth(), getHeight());
	}

}
