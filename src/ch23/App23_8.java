/*
 * JColorChooser
 * 
 * 可以利用此類別來選擇想要用到的顏色。
 * 
 * 呼叫showDialog()，會顯示顏色選擇對話方塊。
 * 在顏色選擇對話方塊中選好顏色後，按下確定按鈕，就會回傳所選取的顏色。
 * =============================================
 * contentPane的屬性設定：
 * 
 * 1. Layout -> BorderLayout
 * =============================================
 * btnChooseColor的屬性設定：
 * 
 * 1. font -> Arial, BOLD, 18
 */

package ch23;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class App23_8 extends JFrame {

	private JPanel contentPane;
	private JButton btnChooseColor;
	
	//產生JColorChooser型態的物件myColorChooser
	private static JColorChooser myColorChooser = new JColorChooser();
	//用來儲存所選取的顏色
	private Color chooseColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App23_8 frame = new App23_8();
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
	public App23_8() {
		setTitle("JColorChooser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		btnChooseColor = new JButton("Choose Color");
		btnChooseColor.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) 
			{
				//按鈕的事件處理
				//顯示挑選顏色的視窗，並將挑選的結果儲存至chooseColor
				chooseColor = myColorChooser.showDialog(getContentPane(), "Choose your color", Color.PINK);
				//使用chooseColor來設定背景顏色
				contentPane.setBackground(chooseColor);
			}
		});
		btnChooseColor.setFont(new Font("Arial", Font.BOLD, 18));
		contentPane.add(btnChooseColor, BorderLayout.SOUTH);
	}

}
