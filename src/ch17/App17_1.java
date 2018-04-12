/*
 * AWT視窗物件
 * 
 * AWT
 * AWT(Abstract Windowing Toolkit)是Java用來處理圖形(包含視窗以及繪圖)最基本的方式，
 * 可以用來建立視窗程式與Applet。
 * 由於是早期的技術，因此每一個物件都會消耗掉大量的資源。
 * 
 * Swing
 * Swing類別庫為AWT的改良版，也更加地美觀。
 * Swing提供的物件數目遠大於AWT，  AWT的每個物件也都可以被Swing取代。
 * 由於Swing的物件均是以AWT的Container類別做為基礎開發，
 * 因此AWT並沒有消失，要了解Swing就得必須先了解AWT才行。
 */

package ch17;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_1 
{
	//App17_1的Data Member
	//因為main()為static Method，所以要宣告成static。
	//frm為視窗物件，視窗的標題為My first AWT program。
	static Frame frm = new Frame("My First AWT Program");
	//lab為標籤物件，標籤的文字為Hello Java!!!。
	static Label lab = new Label("Hello Java!!!");

	public static void main(String[] args) 
	{
		//設定視窗大小
		frm.setSize(270, 150);
		//設定視窗的背景顏色
		frm.setBackground(Color.YELLOW);
		//設定視窗開起實的位置
		frm.setLocation(250, 250);
		//將lab標籤物件放到視窗內
		frm.add(lab);
		//將視窗設定成看得到
		frm.setVisible(true);
		
		//關閉視窗的事件處理
		//引數為匿名物件
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
