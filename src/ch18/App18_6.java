/*
 * KeyEvent
 * 
 * 繼承自InputEvent類別，屬於低階層的事件類別。
 * 
 * 觸發情況：
 * 按下鍵盤上的按鍵時
 * 
 * 實作介面為KeyListener， Override Method如下：
 * 1.keyPressed()
 * 2.keyReleased()
 * 3.keyTyped()
 */

package ch18;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App18_6 extends Frame implements KeyListener
{
	static App18_6 frm = new App18_6();
	static TextField txfd = new TextField(18);
	static TextArea txar = new TextArea("", 4, 19, TextArea.SCROLLBARS_NONE);

	public static void main(String[] args) 
	{
		frm.setTitle("Key Event");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		frm.setLocation(250, 250);
		frm.setSize(250, 170);
		
		frm.add(txfd);
		frm.add(txar);
		
		//註冊傾聽者
		txfd.addKeyListener(frm);
		//設定TextArea不能被編輯
		txar.setEditable(false);
		
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

	//TextField事件處理
	//當按下按鍵時
	@Override
	public void keyPressed(KeyEvent e) 
	{
		txar.setText("");
		txar.append("keyPressed() called\n");
		
	}

	//TextField事件處理
	//當放開按鍵時
	@Override
	public void keyReleased(KeyEvent e) 
	{
		txar.append("keyReleased() called\n");
		
	}

	//TextField事件處理
	//當輸入文字時
	@Override
	public void keyTyped(KeyEvent e) 
	{
		txar.append("keyTyped() called\n");
		
	}

}
