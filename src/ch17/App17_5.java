/*
 * 建立視窗
 * 
 * Frame繼承自Window，Window繼承自Container，
 * Container繼承自Component。
 * 
 * Container類別
 * 概念上可以想像成容器，可以容納其他的視窗物件。
 * 
 * 視窗程式通常是用Frame來當作容器。
 * 
 * 視窗的位置座標是從螢幕左上方開始計算，
 * X軸往右為正數，Y軸往下為正數。
 */

package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_5 
{
	//建立視窗物件，設定視窗標題。
	static Frame frm = new Frame("Frame Class");

	public static void main(String[] args) 
	{
		frm.setSize(200, 150);
		frm.setLocation(250, 250);
		frm.setVisible(true);
		
		frm.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});
		
		//取得視窗的狀態，0代表一般狀態(NORMAL)，1代表被最小化(ICONFIED)。
		System.out.println("State = " + frm.getState());
		//取得視窗標題
		System.out.println("Title = " + frm.getTitle());
		//查詢視窗是否能被看見
		System.out.println("Visiable = " + frm.isVisible());

	}

}
