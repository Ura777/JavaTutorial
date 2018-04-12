/*
 * 建立只能單選的選取方塊物件
 * 
 * 必須搭配CheckGroup才行。
 */

package ch17;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App17_11 
{
	static Frame frm = new Frame("Checkbox class");
	//建立選取方塊物件ckb1、ckb2、ckb3、ckb4、ckb5
	static Checkbox ckb1 = new Checkbox("Apple", true);
	static Checkbox ckb2 = new Checkbox("Banana", true);
	static Checkbox ckb3 = new Checkbox("Coconut");
	static Checkbox ckb4 = new Checkbox("Grape");
	static Checkbox ckb5 = new Checkbox("Lemon");

	public static void main(String[] args) 
	{
		//建立群組物件ckbgrp
		CheckboxGroup ckbgrp = new CheckboxGroup();
		//取消版面配置
		frm.setLayout(null);
		frm.setBackground(Color.YELLOW);
		frm.setSize(250, 150);
		frm.setLocation(250, 250);
		
		//設定選取方塊物件ckb1、ckb2、ckb3、ckb4、ckb5的位置與大小
		ckb1.setBounds(20, 40, 140, 20);
		ckb2.setBounds(20, 60, 140, 20);
		ckb3.setBounds(20, 80, 140, 20);
		ckb4.setBounds(20, 100, 140, 20);
		ckb5.setBounds(20, 120, 140, 20);
		
		//將ckb4、ckb5加入群組
		ckb4.setCheckboxGroup(ckbgrp);
		ckb5.setCheckboxGroup(ckbgrp);
		//將ckb4預設為選取的狀態
		ckb4.setState(true);
		
		//將選取方塊物件ckb1、ckb2、ckb3、ckb4、ckb5加入到視窗內
		frm.add(ckb1);
		frm.add(ckb2);
		frm.add(ckb3);
		frm.add(ckb4);
		frm.add(ckb5);
		
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
