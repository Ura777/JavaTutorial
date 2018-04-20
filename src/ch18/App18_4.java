/*
 * ItemEvent
 * 
 * 觸發情況：
 * 選項物件被選取時
 * 
 * 實作介面為ItenListener，
 * Override Method為itemStateChanged()。
 */

package ch18;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App18_4 extends Frame implements ItemListener
{
	static App18_4 frm = new App18_4();
	static Label label = new Label("Choose 1 Fruit");
	static Checkbox ckb1 = new Checkbox("Apple");
	static Checkbox ckb2 = new Checkbox("Banana");

	public static void main(String[] args) 
	{
		frm.setTitle("Item Event");
		frm.setLayout(new FlowLayout(FlowLayout.LEFT));
		frm.setLocation(250, 250);
		frm.setSize(300, 150);
		
		frm.add(label);
		frm.add(ckb1);
		frm.add(ckb2);
		
		//設定標籤的背景色
		label.setBackground(Color.ORANGE);
		
		//將選項設定為單選
		CheckboxGroup ckbg = new CheckboxGroup();
		ckb1.setCheckboxGroup(ckbg);
		ckb2.setCheckboxGroup(ckbg);
		
		//註冊傾聽者
		ckb1.addItemListener(frm);
		ckb2.addItemListener(frm);

		
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

	//CheckBox事件處理
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		
		if(ckb1.getState())
		{
			label.setText(ckb1.getLabel());
		}
		else if(ckb2.getState())
		{
			label.setText(ckb2.getLabel());
		}
		
	}

}
