/*
 * 使用MouseMotionListener介面處理MouseEvent
 * 
 * 繼承自InputEvent類別，屬於低階層的事件類別。
 * 
 * MouseMotionListener
 * 1.傾聽事件如下：
 *   移動、拖曳滑鼠
 *   
 * 2.實作Method如下：
 *   mouseDragged()
 *   mouseMoved()
 */

package ch18;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class App18_10 extends Frame implements MouseMotionListener
{
	static App18_10 frm = new App18_10();
	static Label labelShowX = new Label();
	static Label labelShowY = new Label();
	static Label labelShowMessage = new Label();

	public static void main(String[] args) 
	{
		frm.setTitle("Mouse Event");
		frm.setLayout(null);
		frm.setLocation(250, 250);
		frm.setSize(250, 170);
		
		frm.add(labelShowX);
		frm.add(labelShowY);
		frm.add(labelShowMessage);
		
		//設定標籤的位置與大小
		labelShowX.setBounds(40, 40, 40, 20);
		labelShowY.setBounds(100, 40, 40, 20);
		labelShowMessage.setBounds(40, 80, 100, 40);
		
		//註冊傾聽者
		frm.addMouseMotionListener(frm);
		
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

	//當滑鼠在拖曳時
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		labelShowX.setText("x = " + e.getX());
		labelShowY.setText("y = " + e.getY());
		labelShowMessage.setText("Mouse Dragged!!!");
	}

	//當滑鼠在移動時
	@Override
	public void mouseMoved(MouseEvent e) 
	{
		labelShowX.setText("x = " + e.getX());
		labelShowY.setText("y = " + e.getY());
		labelShowMessage.setText("Mouse Moved!!!");
	}

}
