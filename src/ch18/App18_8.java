/*
 * MouseEvent
 * 
 * 繼承自InputEvent類別，屬於低階層的事件類別。
 * 
 * 觸發情況：
 * 點擊左鍵、右鍵、滾輪
 * 移出、移入事件發生來源
 * 移動、拖曳滑鼠
 * 
 * 實作介面有2個，分別為MouseListener與MouseMotionListener。 
 * 
 * MouseListener
 * 1.傾聽事件如下：
 *   點擊左鍵、右鍵、滾輪
 *   移出、移入事件發生來源
 *   
 * 2.實作Method如下：
 *   mousePressed()
 *   mouseReleased()
 *   mouseClicked() -> 此方法是在事件來源上按1下，動作包含按下與放開2個程序。
 *   mouseEntered()
 *   mouseExited()
 * 
 * MouseMotionListener
 * 1.傾聽事件如下：
 *   移動、拖曳滑鼠
 *   
 * 2.實作Method如下：
 *   mouseDragged()
 *   mouseMoved()
 * 
 * 本範例為使用MouseListener處理MouseEvent
 */

package ch18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App18_8 extends Frame implements MouseListener
{
	static App18_8 frm = new App18_8();
	static Button btn = new Button("Click Me");
	static TextArea txar = new TextArea("", 2, 5, TextArea.SCROLLBARS_NONE);

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		//宣告BorderLayout物件border
		BorderLayout border = new BorderLayout(2, 5);
		frm.setTitle("Mouse Event");
		//版面配置設定成border
		frm.setLayout(border);
		frm.setLocation(250, 250);
		frm.setSize(250, 170);
		
		//Button擺在左邊
		frm.add(btn, border.WEST);
		//TextArea擺在中間
		frm.add(txar, border.CENTER);
		
		//註冊傾聽者
		btn.addMouseListener(frm);
				
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

	//按下並且放開滑鼠按鈕時
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		txar.append("Mouse clicked\n");	
	}

	//滑鼠游標進入Button上方時
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		txar.setText("Mouse entered\n");		
	}

	//滑鼠游標離開Button上方時
	@Override
	public void mouseExited(MouseEvent e) 
	{
		txar.append("Mouse exited\n");
	}

	//按下滑鼠按鈕時
	@Override
	public void mousePressed(MouseEvent e) 
	{
		txar.append("Mouse pressed\n");
	}

	//放開滑鼠按鈕時
	@Override
	public void mouseReleased(MouseEvent e) 
	{
		txar.append("Mouse released\n");
	}

}
