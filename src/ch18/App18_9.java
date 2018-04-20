/*
 * 使用MouseAdapter類別處理MouseEvent
 */

package ch18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App18_9 extends Frame
{
	static App18_9 frm = new App18_9();
	static Button btn = new Button("Click Me");
	static TextArea txar = new TextArea("", 2, 5, TextArea.SCROLLBARS_NONE);
	
	//內部類別MyMouseListener
	static class MyMouseListener extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent e) 
		{
			//取得點擊時的座標
			int x = e.getX();
			int y = e.getY();
			
			txar.append("Clicked at (" + x + "," + y + ")\n");
		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		//宣告BorderLayout物件border
		BorderLayout border = new BorderLayout(2, 5);
		frm.setTitle("Mouse Event");
		//版面配置設定成border
		frm.setLayout(border);
		frm.setLocation(250, 250);
		frm.setSize(250, 170);
		
		//Button擺在左邊
		frm.add(btn, border.WEST);
		//TextArea擺在中間
		frm.add(txar, border.CENTER);
		
		//註冊傾聽者為內部類別MyMouseListener的匿名物件
		btn.addMouseListener(new MyMouseListener());
				
		frm.setVisible(true);
		
		frm.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});

	}
}
