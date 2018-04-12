/*
 * 方格式版面配置
 * 
 * Grid Layout
 * 格子狀的排版方式，例如機算機上的按鈕。
 * 排版方式為由左而右、由上到下。
 * 會依照視窗的大小自動調整物件的大小。
 */

package ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_17 
{
	static Frame frm = new Frame("Card Layout");

	public static void main(String[] args) 
	{
		//產生方格式版面配置物件gird
		//引數為列數、行數
		GridLayout grid = new GridLayout(3, 5);
		//設定視窗的版面配置
		frm.setLayout(grid);
		
		frm.setBackground(Color.GRAY);
		frm.setSize(250, 150);
		frm.setLocation(250, 250);
		
		//利用迴圈將15個按鈕加入到視窗內。
		for(int i=1; i<=15; i++)
		{
			frm.add(new Button(String.valueOf(i)));
		}

		
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
