/*
 * WindowEvent
 * 
 * 繼承自InputEvent類別，屬於低階層的事件類別。
 * 
 * 觸發情況：
 * 建立、關閉視窗
 * 縮小至工具列
 * 
 * 實作介面為WindowListener，需要Override的Method如下： 
 * 1.windowActivated() -> 由非作中變成作用中
 * 2.windowClosed() -> 已經被關閉
 * 3.windowClosing() -> 按下視窗關閉紐時
 * 4.windowDeactivated() -> 由作用中變成非作用中
 * 5.windowDeiconified() -> 由最小化變成一般狀態
 * 6.windowIconified() -> 由一般狀態變成最小化
 * 7.windowOpend() -> 開啟時
 * 
 * 本範例為使用WindowAdapter類別來處理WindowEvent。
 */

package ch18;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App18_11 extends Frame
{
	static App18_11 frm = new App18_11();
	
	//內部類別MyWindowListener
	static class MyWindowListener extends WindowAdapter
	{
		//按下視窗關閉紐時
		@Override
		public void windowClosing(WindowEvent e) 
		{
			System.out.println("windowClosing() called");
			System.out.println("Closing window...");
			//關閉視窗並且釋放資源
			frm.dispose();
			System.out.println("Window closed...");
		}
	}

	public static void main(String[] args) 
	{
		frm.setTitle("Window Event");
		frm.setLocation(250, 250);
		frm.setSize(250, 150);	
		
		//註冊傾聽者為內部類別MyWindowListener的匿名物件
		frm.addWindowListener(new MyWindowListener());
		
		frm.setVisible(true);
	}

}
