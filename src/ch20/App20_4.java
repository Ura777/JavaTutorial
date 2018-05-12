/*
 * 不透過按鈕讓視窗一開始就畫好圖案
 * 
 * 將繪圖的程式碼寫在paint()即可。
 * 
 * 只有Component類別與其子類別才會自動執行paint()，
 * 因此在本範例中，必須先讓App20_4先繼承Frame，然後再產生物件frm。
 * 如果沒有這樣做，paint()將會找不到正確的繪圖區。
 * 
 * drawString()的座標是以字串的左下角相對於原點的位置。
 */

package ch20;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App20_4 extends Frame
{
	static App20_4 frm = new App20_4();

	public static void main(String[] args) 
	{
		frm.setTitle("Drawing Demo");
		frm.setLocation(250, 250);
		frm.setSize(220, 150);
		
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
	
	//自動畫圖
	@Override
	public void paint(Graphics g) 
	{
		g.setFont(new Font("Arial", Font.ITALIC, 18));
		//引數為字串,X座標,Y座標
		g.drawString("Live and Learn", 55, 88);
		g.setColor(Color.RED);
		g.drawRect(40, 65, 145, 30);
	}

}
