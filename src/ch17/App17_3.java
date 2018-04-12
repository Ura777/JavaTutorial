/*
 * 簡單的AWT範例-3
 * 
 * 接續App17_2，讓App17_3繼承自Frame類別，
 * 就可以直接用App17_3產生Frame物件。
 */

package ch17;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")

//讓App17_3繼承自Frame類別
public class App17_3 extends Frame
{

	public static void main(String[] args) 
	{
		//用App17_3產生視窗物件frm
		App17_3 frm = new App17_3();
		
		Label lab = new Label("Hello Java!!!");
		
		//設定視窗標題
		frm.setTitle("My First AWT Program");
		frm.setSize(270, 150);
		frm.setBackground(Color.YELLOW);
		frm.setLocation(250, 250);
		frm.add(lab);
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
