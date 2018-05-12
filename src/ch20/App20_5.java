/*
 * RGB的進階應用
 */

package ch20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App20_5 extends Frame implements AdjustmentListener
{
	static App20_5 frm = new App20_5();
	/*
	 * 宣告3個控制顏色數值的捲軸
	 * scbrRed控制紅色
	 * scbrGreen控制綠色
	 * scbrBlue控制藍色	
	 */
	static Scrollbar scbrRed = new Scrollbar(Scrollbar.VERTICAL);
	static Scrollbar scbrGreen = new Scrollbar(Scrollbar.HORIZONTAL);
	static Scrollbar scbrBlue = new Scrollbar(Scrollbar.VERTICAL);

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		BorderLayout br = new BorderLayout(5, 5);
		frm.setTitle("Display Color");
		frm.setLocation(250, 250);
		frm.setSize(300, 300);
		
		//設定捲軸的相關數值
		scbrRed.setValues(0, 45, 0, 300);
		scbrGreen.setValues(0, 45, 0, 300);
		scbrBlue.setValues(0, 45, 0, 300);
		
		//捲軸註冊傾聽者為frm
		scbrRed.addAdjustmentListener(frm);
		scbrGreen.addAdjustmentListener(frm);
		scbrBlue.addAdjustmentListener(frm);
		
		frm.add(scbrRed, br.WEST);	
		frm.add(scbrGreen, br.SOUTH);	
		frm.add(scbrBlue, br.EAST);	
		
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

	//捲軸的事件處理
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) 
	{
		Graphics g = getGraphics();
		paint(g);		
	}
	
	//根據捲軸的數值來更改呈現的顏色
	@Override
	public void paint(Graphics g) 
	{
		//取得3種顏色的數值
		int red = scbrRed.getValue();
		int green = scbrGreen.getValue();
		int blue = scbrBlue.getValue();
		
		//要顯示的訊息
		String message = String.format("Color(%d,%d,%d)", red, green, blue);
		
		//設定繪圖顏色
		g.setColor(new Color(red, green, blue));
		//繪製填滿顏色的長方形
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString(message, 70, 150);
	}

}
