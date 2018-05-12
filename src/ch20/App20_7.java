/*
 * 列出系統所提供的字型
 * 此範例是呼叫update()進行畫面的更新。
 * 
 * update()
 * 會先將畫面清除成底色，然後再呼叫paint()。
 * 如果改成直接呼叫paint()，會讓每次新選的字體名稱覆蓋在原來的字體名稱上面。
 */

package ch20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App20_7 extends Frame implements ItemListener
{
	static App20_7 frm = new App20_7();
	//宣告List物件fontList
	static List fontList = new List();
	//預設的字體名稱為Arial
	String selectedFontName = "Arial";

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		BorderLayout br = new BorderLayout(5, 5);
		frm.setTitle("Font List");
		frm.setLayout(br);
		frm.setLocation(250, 250);
		frm.setSize(300, 150);
		frm.setBackground(Color.YELLOW);
		
		//建立GraphicsEnvironment物件ge
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		//利用ge來取得系統所提供的字型
		String systemFontName[] = ge.getAvailableFontFamilyNames();
		
		//使用foreach將儲存在陣列systemFontName中的字型名稱加入至fontList
		for(String str:systemFontName)
		{
			fontList.add(str);			
		}
		
		//註冊傾聽者為frm
		fontList.addItemListener(frm);
		
		frm.add(fontList, br.NORTH);
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
	
	//fontList的事件處理
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		selectedFontName = fontList.getSelectedItem();
		Graphics g = getGraphics();
		//會先把畫面清除成底色，然後再呼叫paint()。
		update(g);
	}
	
	@Override
	public void paint(Graphics g) 
	{
		g.setFont(new Font(selectedFontName, Font.PLAIN, 20));
		g.setColor(Color.BLACK);
		g.drawString(selectedFontName, 20, 110);
	}
}
