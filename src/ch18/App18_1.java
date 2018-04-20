/*
 * 委派事件模式 Delegation Event Model
 * 
 * 此為JAVA的事件處理模式。
 * 當事件發生時，產生事件的物件(也就是事件的發生來源，Event Source，例如：Button)，
 * 之後會將此「訊息」傳給事件傾聽者(Event Listener)。
 * 
 * 訊息
 * 實際上是指java.awt.event類別庫內，某個類別所建立的物件，
 * 又稱為事件物件(Event Object)。
 * 
 * 舉例說明：按下按鈕
 * 按下按鈕時，會觸發1個動作事件(Action Event)。
 * 此時Java會產生1個「事件物件(訊息)」來表示這個事件， 然後傳遞給事件傾聽者。
 * 事件傾聽者再依據事件物件的種類，把工作指派給專門的事件處理者。
 * 
 * 為了要讓產生事件的物件知道要將訊息傳遞給哪個事件傾聽者，
 * 事件傾聽者必須先向產生事件的物件進行註冊(Register)。
 * 
 * 本範例為按下按鈕後可以更改背景顏色。
 * 事件發生來源：Button
 * 事件傾聽者：繼承自Frame的App18_1
 * 
 * 為了讓App18_1能夠傾聽事件，因此必須實作介面ActionListener。
 * 實作ActionListener後，必須要立刻Override actionPerformed()。
 */

package ch18;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//實作介面ActionListener
@SuppressWarnings("serial")
public class App18_1 extends Frame implements ActionListener
{
	static App18_1 frm = new App18_1();
	static Button btn = new Button("Click Me");

	public static void main(String[] args) 
	{
		frm.setLayout(new FlowLayout());
		frm.setTitle("Action Event");
		frm.setLocation(250, 250);
		frm.setSize(200, 150);
		frm.add(btn);
		
		//傾聽者frm向事件來源者btn註冊
		btn.addActionListener(frm);
		
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

	//事件發生的處理動作
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		frm.setBackground(Color.YELLOW);		
	}

}
