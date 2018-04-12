/*
 * 簡單的AWT範例-2
 * 
 * 接續App17_1，將Data Member的static拿掉。
 */

package ch17;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_2 
{

	public static void main(String[] args) 
	{
		//將Data Member移動到main()內就不需要加上static
		Frame frm = new Frame("My First AWT Program");
		Label lab = new Label("Hello Java!!!");
		
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
