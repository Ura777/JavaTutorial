/*
 * JInternalFrame
 * 
 * Swing可以透過JinternalFrame類別來建立內部視窗。
 * JInternalFrame必須要依附在JFrame裡面才行。
 * ========================================================================
 * JDesktopPane
 * 
 * 桌面層屬於Layered Pane裡的其中一個，他是虛擬桌面，Java利用其來管理內部視窗之間的層級關係。
 * 通常在建立內部視窗時，會先把內部視窗加入至JDesktopPane中。
 * ========================================================================
 * contentPane與desktopPane的屬性設定：
 * 
 * 1. Layout -> absolute
 * ========================================================================
 * 本範例為按下主視窗的按鈕後會產生內部視窗。
 */

package ch23;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class App23_2 extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	private JButton btnNewButton;
	private JInternalFrame internalFrame;
	private JButton btnFrameButton;
	
	//用來紀錄開了幾個內部視窗
	private static int count = 0;
	//用來紀錄內部視窗的座標
	private static int locationX = 10, locationY = 10;
	//座標偏移值
	private static int locationBias = 10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App23_2 frame = new App23_2();
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
	public App23_2() {
		setResizable(false);
		setTitle("JInternalFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		desktopPane.setBounds(10, 10, 414, 210);
		contentPane.add(desktopPane);
		
		btnNewButton = new JButton("Show Internal Frame");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				//按鈕的事件處理
				
				//記錄+1，代表開啟了1個內部視窗。
				count+=1;
				
				//只有第1個內部視窗的座標是(10,10)
				//第2個開始的內部視窗的座標必須要加上座標偏移值
				if(count!=1)
				{
					locationX+=locationBias;
					locationY+=locationBias;
				}
				
				//內部視窗的相關設定
				internalFrame = new JInternalFrame("Frame" + count);
				internalFrame.setBounds(locationX, locationY, 186, 140);
				//將內部視窗加入至桌面層
				desktopPane.add(internalFrame);
				
				btnFrameButton = new JButton("Frame" + count + " Button");
				internalFrame.getContentPane().add(btnFrameButton, BorderLayout.SOUTH);
				internalFrame.setVisible(true);
			}
		});
		btnNewButton.setBounds(132, 230, 178, 23);
		contentPane.add(btnNewButton);
	}
}
