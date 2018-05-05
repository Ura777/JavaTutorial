/*
 * 捲軸(Scroll Bars)與其事件處理
 * 
 * 由2個捲軸符號(<、>)、捲軸盒(可以被拖拉的長方形)、捲軸列組成。
 * 
 * 捲軸方向可以用2個類別變數：HORIZONTAL(水平)與VERTICAL(垂直)設定。
 * 
 * setVisibleAmount()可以設定捲軸盒的大小，
 * 捲軸合的大小會影響捲軸的回傳值。
 * EX：捲軸的值為20 ~ 180，捲軸盒的大小為40，因此捲軸可以回傳的數值為20 ~ 140。
 * 
 * 觸發事件：AdjustmentEvent
 * 傾聽介面：AdjustmentListener
 * 實作方法：adjustmentValueChanged()
 */

package ch19;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App19_7 extends Frame implements AdjustmentListener
{
	static App19_7 frm = new App19_7();
	//宣告Scrollbar物件scrb
	//預設建構元會產生垂直方向的捲軸
	static Scrollbar scrb = new Scrollbar();
	//宣告Label物件lab01、lab02
	static Label lab01 = new Label("Silence is golden.", Label.CENTER);
	static Label lab02 = new Label("Size = 20", Label.CENTER);

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		BorderLayout br = new BorderLayout(5, 5);
		frm.setTitle("Scrollbar Demo");
		frm.setLocation(250, 250);
		frm.setSize(400, 200);
		
		//設定捲軸的數值、捲軸盒可視大小、捲軸最小值、捲軸最大值
		scrb.setValues(20, 4, 12, 40);
		//註冊傾聽者為frm
		scrb.addAdjustmentListener(frm);
		
		///設定lab01的字型樣式
		lab01.setFont(new Font("Dialog", Font.PLAIN, 20));
		//設定lab02的背景顏色
		lab02.setBackground(Color.ORANGE);
		
		frm.add(scrb, br.EAST);
		frm.add(lab01, br.CENTER);
		frm.add(lab02, br.SOUTH);
		frm.setVisible(true);
		
		frm.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				frm.dispose();
			}
		});

	}

	//scrb的事件處理
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) 
	{
		//取得scrb的數值
		int size = scrb.getValue();
		
		//設定lab01的字型樣式
		//字體大小會隨著捲軸的數值而更動
		lab01.setFont(new Font("Dialog", Font.PLAIN, size));
		lab02.setText("Size = " + size);
		
	}

}
