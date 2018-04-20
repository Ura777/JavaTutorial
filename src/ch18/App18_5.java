/*
 * TextEvent
 * 
 * 觸發情況：
 * TextField或TextArea物件裡的文字改變時
 * 
 * 實作介面為TextListener，
 * Override Method為textValueChanged()。
 */

package ch18;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App18_5 extends Frame implements TextListener
{
	static App18_5 frm = new App18_5();
	static TextArea txarLeft = new TextArea("", 6, 10, TextArea.SCROLLBARS_NONE);
	static TextArea txarRight = new TextArea("", 6, 10, TextArea.SCROLLBARS_NONE);

	public static void main(String[] args) 
	{
		frm.setTitle("Text Event");
		frm.setLayout(new FlowLayout(FlowLayout.CENTER));
		frm.setLocation(250, 250);
		frm.setSize(250, 170);
		
		frm.add(txarLeft);
		frm.add(txarRight);
		
		//註冊傾聽者
		txarLeft.addTextListener(frm);
		//右邊的TextArea設定成不能編輯
		txarRight.setEditable(false);
		
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

	//TextArea事件處理
	@Override
	public void textValueChanged(TextEvent e) 
	{
		txarRight.setText(txarLeft.getText());
		
	}

}
