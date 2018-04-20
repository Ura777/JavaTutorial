/*
 * 使用KeyAdapter處理KeyEvent
 * 
 * 當傾聽者介面的事件處理方法超過1個時，可以使用事件轉接器(Adapter)來處理。
 * 
 * 事件轉接器類別 Adapter
 * Adapter裡面所定義的函數皆為空的，也就是沒有任何程式敘述，
 * 因此可以繼承Adapter後，再針對有用到的Method去撰寫程式碼。
 * 
 * ActionKey
 * 功能鍵，例如Tab、F1。
 * 
 * 某些按鍵沒有被歸類在ActionKey，而且又不能被印出字元，
 * 此時就會以「□」來表示。
 */

package ch18;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App18_7 extends Frame
{
	static App18_7 frm = new App18_7();
	static TextField txfd = new TextField(18);
	static TextArea txar = new TextArea("", 4, 19, TextArea.SCROLLBARS_NONE);
	
	//內部類別MyKeyAdapter
	static class MyKeyAdapter extends KeyAdapter
	{
		//針對按下按鍵時的情況進行處理
		@Override
		public void keyPressed(KeyEvent e) 
		{
			txar.setText("");
			
			//如果按下的案件是ActionKey
			if(e.isActionKey())
			{
				txar.append("Action Key is pressed\n");
			}
			else
			{
				txar.append(e.getKeyChar() + " is pressed\n");
			}
		}
	}

	public static void main(String[] args) 
	{
		frm.setTitle("Key Event");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		frm.setLocation(250, 250);
		frm.setSize(250, 170);
		
		frm.add(txfd);
		frm.add(txar);
		
		//註冊傾聽者為內部類別MyKeyAdapter的匿名物件
		txfd.addKeyListener(new MyKeyAdapter());
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

}
