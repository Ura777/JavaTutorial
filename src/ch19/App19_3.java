/*
 * 下拉式表單 Choice
 */

package ch19;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App19_3 extends Frame
{
	static App19_3 frm = new App19_3();
	//建立Choice物件dropDown
	static Choice dropDown = new Choice();

	public static void main(String[] args) 
	{
		frm.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		frm.setTitle("Choice Class");
		frm.setLocation(250, 250);
		frm.setSize(250, 150);
		frm.setBackground(Color.YELLOW);
		
		//利用迴圈加入選項
		for(int i=0; i<=4; i++)
		{
			dropDown.add("Choice Item " + i);
		}
		
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

}
