/*
 * 下拉式表單的事件處理
 * 
 * 觸發事件：ItemEvent
 * 傾聽介面：ItemListener
 * 實作方法：itemStateChanged()
 */

package ch19;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App19_4 extends Frame implements ItemListener
{
	static App19_4 frm = new App19_4();
	//建立Choice物件dropDown
	static Choice dropDown = new Choice();

	public static void main(String[] args) 
	{
		frm.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		frm.setTitle("Select a Color");
		frm.setLocation(250, 250);
		frm.setSize(250, 150);
		frm.setBackground(Color.YELLOW);
		
		//新增4個顏色的選項
		dropDown.add("Yellow");
		dropDown.add("Orange");
		dropDown.add("Pink");
		dropDown.add("Cyan");
				
		//註冊傾聽者為frm
		dropDown.addItemListener(frm);
		
		frm.add(dropDown);
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

	//dropDown的事件處理
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		//取得被選取的選項名稱
		String color = dropDown.getSelectedItem();
		
		if(color == "Yellow")
		{
			frm.setBackground(Color.YELLOW);
		}
		else if (color == "Orange")
		{
			frm.setBackground(Color.ORANGE);
		}
		else if (color =="Pink")
		{
			frm.setBackground(Color.PINK);
		}
		else if (color == "Cyan")
		{
			frm.setBackground(Color.CYAN);
		}
		
	}

}
