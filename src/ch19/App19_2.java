/*
 * 選擇表單的事件處理
 * 
 * 觸發事件：ItemEvent
 * 傾聽介面：ItemListener
 * 實作方法：itemStateChanged()
 */

package ch19;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App19_2 extends Frame implements ItemListener
{
	static App19_2 frm = new App19_2();
	//宣告List物件lst
	static List lst = new List();

	public static void main(String[] args) 
	{
		frm.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 25));
		frm.setTitle("Select a Color");
		frm.setLocation(250, 250);
		frm.setSize(250, 150);
		
		//新增4個顏色的選項
		lst.add("Yellow");
		lst.add("Orange");
		lst.add("Pink");
		lst.add("Cyan");
		
		//註冊傾聽者為frm
		lst.addItemListener(frm);
		
		frm.add(lst);
		frm.setVisible(true);
		
		
		frm.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				frm.dispose();
			}
		});
		
		//顯示lst所顯示的列數
		System.out.println("lst.getRows() = " + lst.getRows());
		//顯示lst內選項的總數
		System.out.println("lst.getItemCount() = " + lst.getItemCount());

	}

	//lst的事件處理
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		//取得被選取的選項名稱
		String color = lst.getSelectedItem();
		
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
