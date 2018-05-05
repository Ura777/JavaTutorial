/*
 * 對話方塊 Dialog Box
 * 
 * 與Frame一樣，都是繼承自Window類別，因此可以放置AWT的物件。
 * 
 * 對話方塊必須要指定其擁有者(Owner)，
 * Owner可以是Frame或是另外一個對話方塊。
 * 
 * 對話方塊可以分成主控與非主控：
 * 1.主控對話方塊 -> 使用者一定要處理完主控對話方塊的事情後，才能回到Owner視窗內繼續執行。
 * 2.非主控對話方塊 -> 沒有主控對話方塊之性質的限制。
 * 
 * 對話方塊並不會自動顯示，因此要呼叫setVisible(true)才能顯示。
 * 
 * 本範例的描述如下：
 * 1.按下Change Color的按鈕後，顯示對話方塊。
 * 2.對話方塊上有2個單選的顏色選項：White與Yellow。
 * 3.選擇好顏色選項後按下對話方塊的OK按鈕，即可變更原來視窗的背景顏色。
 * 4.按下Cancel按鈕後，則會關閉對話方塊，回到原來的視窗。
 */

package ch19;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App19_8 extends Frame implements ActionListener, ItemListener
{
	static App19_8 frm = new App19_8();
	//宣告Button物件btnChange、btnOK、btnCancel
	static Button btnChangeColor = new Button("Change Color");
	static Button btnOK = new Button("OK");
	static Button btnCancel = new Button("Cancel");
	//宣告Checkbox物件ckbxColorWhite、ckbxColorBlack
	static Checkbox ckbxColorWhite = new Checkbox("White");
	static Checkbox ckbxColorBlack = new Checkbox("Black");
	//宣告Dialog物件dialogAsk
	//Owner為frm
	static Dialog dialogAsk = new Dialog(frm);
	
	//宣告用來儲存使用者選擇之顏色的變數chooseColor
	//預設數值為Color.BLACK
	static Color chooseColor = Color.BLACK;

	public static void main(String[] args) 
	{
		//Frame的相關設定
		frm.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
		frm.setTitle("App19_8 Frame");
		frm.setLocation(250, 250);
		frm.setSize(400, 200);
		frm.setBackground(Color.PINK);
		btnChangeColor.addActionListener(frm);
		frm.add(btnChangeColor);
		frm.setVisible(true);
		frm.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				frm.dispose();
			}
		});
		
		//Dialog的相關設定
		dialogAsk.setTitle("System Message");
		dialogAsk.setSize(200, 150);
		dialogAsk.setLayout(null);
		dialogAsk.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				dialogAsk.dispose();
			}
		});
		
		//Checkbox的相關設定
		CheckboxGroup ckbxgColor = new CheckboxGroup();
		ckbxColorBlack.setCheckboxGroup(ckbxgColor);
		ckbxColorBlack.setBounds(20, 50, 60, 20);
		ckbxColorBlack.setState(true);
		ckbxColorBlack.addItemListener(frm);
		ckbxColorWhite.setCheckboxGroup(ckbxgColor);
		ckbxColorWhite.setBounds(20, 70, 60, 20);
		ckbxColorWhite.addItemListener(frm);
		
		//Button的相關設定
		btnOK.setBounds(85, 45, 50, 20);
		btnOK.addActionListener(frm);
		btnCancel.setBounds(85, 70, 50, 20);
		btnCancel.addActionListener(frm);
		
		//將CheckBox、Button加入到Dialog
		dialogAsk.add(ckbxColorBlack);
		dialogAsk.add(ckbxColorWhite);
		dialogAsk.add(btnOK);
		dialogAsk.add(btnCancel);

	}

	//CheckBox的事件處理
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(ckbxColorBlack.getState())
		{
			chooseColor = Color.BLACK;
		}
		if(ckbxColorWhite.getState())
		{
			chooseColor = Color.WHITE;
		}
		
	}

	//Button的事件處理
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//取得觸發事件的來源
		Button btn = (Button)e.getSource();
		
		//Change Color按鈕
		if(btn.equals(btnChangeColor))
		{
			dialogAsk.setLocation(400, 270);
			dialogAsk.setVisible(true);
		}
		
		//OK按鈕
		if(btn.equals(btnOK))
		{
			frm.setBackground(chooseColor);
			dialogAsk.setVisible(false);
		}
		
		//Cancel按鈕
		if(btn.equals(btnCancel))
		{
			dialogAsk.setVisible(false);
		}
	}

}
