/*
 * JCheckBox與JRadioButton
 * 
 * 兩者的功能都一樣，只是差在勾選時樣子不同。
 * ====================================
 * ButtonGroup
 * 
 * 可以限制在群組內的物件只有1個狀態為True。
 * ====================================
 * contentPane的屬性設定：
 * 
 * 1. Layout -> absolute
 * ====================================
 * rdbtnCamer的屬性設定
 * 
 * 1. selected -> true
 * ====================================
 * chckbxBrand的屬性設定
 * 
 * 1. selected -> true
 * ====================================
 * checkBoxBrand2的屬性設定
 * 
 * 1. selected -> true
 */

package ch23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class App23_5 extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnCamera;
	private JRadioButton rdbtnCamera2;
	private JCheckBox chckbxBrand;
	private JCheckBox checkBoxBrand3;
	private JCheckBox checkBoxBrand2;
	
	//宣告群組物件
	private ButtonGroup cameraGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App23_5 frame = new App23_5();
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
	public App23_5() {
		setResizable(false);
		setTitle("CheckBox Class");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 223, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdbtnCamera = new JRadioButton("數位攝影機");
		rdbtnCamera.setSelected(true);
		rdbtnCamera.setBounds(10, 20, 90, 20);
		contentPane.add(rdbtnCamera);
		
		rdbtnCamera2 = new JRadioButton("數位相機");
		rdbtnCamera2.setBounds(107, 20, 78, 20);
		contentPane.add(rdbtnCamera2);
		
		//產生cameraGroup物件
		//將RadioButton放入群組中設定成單選
		cameraGroup = new ButtonGroup();
		cameraGroup.add(rdbtnCamera);
		cameraGroup.add(rdbtnCamera2);
		
		chckbxBrand = new JCheckBox("Sony");
		chckbxBrand.setSelected(true);
		chckbxBrand.setBounds(20, 60, 140, 20);
		contentPane.add(chckbxBrand);
		
		checkBoxBrand2 = new JCheckBox("Nikon");
		checkBoxBrand2.setSelected(true);
		checkBoxBrand2.setBounds(20, 80, 140, 20);
		contentPane.add(checkBoxBrand2);
		
		checkBoxBrand3 = new JCheckBox("Others");
		checkBoxBrand3.setBounds(20, 100, 140, 20);
		contentPane.add(checkBoxBrand3);
	}
}
