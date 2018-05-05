/*
 * 選擇表單 List
 * 
 * 可以一次顯示多個選項。
 * 表單內選項的索引值(Index)由0開始。
 * 
 * 先用add()將選項加入至表單，再用程式控制顯示方式。
 */

package ch19;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App19_1 extends Frame
{
	static App19_1 frm = new App19_1();
	//宣告List物件lst
	static List lst = new List();

	public static void main(String[] args) 
	{
		frm.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 25));
		frm.setTitle("List Class");
		frm.setLocation(250, 250);
		frm.setSize(200, 150);
		frm.setBackground(Color.YELLOW);
		
		//利用迴圈將選項加入至lst
		for(int i=0; i<=9; i++)
		{
			lst.add("List Item " + i);
		}
		//選取index = 2的選項
		lst.select(2);
		
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

}
