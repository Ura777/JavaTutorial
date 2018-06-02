/*
 * Eclipse提供的WindowBuilder套件
 * 
 * 在開發Swing時，可以先在Eclipse中安裝WindowBuilder套件。
 * 該套件有提供圖形化介面(Design介面)，可以透過拖拉元件的方式進行設計樣式。
 * 拖拉元件時，WindowBuilder會自動產生程式碼。
 * =====================================================
 * WindowBuilder的安裝方式
 * 
 * 1. 點選上方工具列的Help選項，再點選Eclipse Marketplace選項。
 * 2. 在打開的視窗中點選Search標籤，之後在「Find:」後方輸入WindowBuilder，輸入完成後按下放大鏡的按鈕進行搜尋。
 * 3. 搜尋完成後，點選Install按鈕。
 * 4. 安裝完成後會要求重新開啟Eclipse，這時請選擇重新開啟的選項。
 * =====================================================
 * WindowBuilder的設定
 * 
 * 1. 點選上方工具列的Window選項，再點選Preferences選項。
 * 2. 在打開的視窗的右邊，依序點選WindowBuilder、Swing、Code Generation。
 * 3. 勾選在「Variable generation:」底下的Field選項。
 * 4. 按下Apply and Close按鈕。
 * =====================================================
 * Swing的概述
 * 
 * 幾乎每個AWT物件都有一個對應的Swing介面。
 * Swing還提供AWT所沒有的物件，例如：進度條、內部視窗。
 * 在Swing中的物件大都以大寫J開頭，這是用來方便區分原本的AWT物件。
 * Swing的物件大部分都是放在類別庫javax.swing中。
 * Swing的物件大部分都是直接或是間接濟成AWT的Container類別。
 * =====================================================
 * JFrame
 * 
 * JFrame有包含好幾個Layer，每個Layer都有特定的功能。
 * 常用的Layer為Content pane，許多Swing的物件都會放置在此Layer當中。
 * =====================================================
 * contentPane的屬性設定：
 * 
 * 1. Layout -> FlowLayout
 * =========================================
 * 本範例為按下按鈕後會改變背景顏色。
 */

package ch23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class App23_1 extends JFrame {

	private JPanel contentPane;
	private JButton btnClickMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App23_1 frame = new App23_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public App23_1() {
		setTitle("JFrame視窗");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//這邊撰寫按鈕的事件處理
				//透過contentPane取得目前的背景顏色
				if (contentPane.getBackground() == Color.PINK)
				{
					contentPane.setBackground(Color.YELLOW);
				}
				else
				{
					contentPane.setBackground(Color.PINK);
				}
			}
		});
		btnClickMe.setSize(new Dimension(200, 150));
		contentPane.add(btnClickMe);
	}

}
