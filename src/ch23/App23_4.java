/*
 * ImageIcon與JLabel
 * 
 * JLabel可以加入影像，這是AWT的Label所無法使用的功能。
 * ===============================================
 * contentPane的屬性設定：
 * 
 * 1. Layout -> absolute
 * ===============================================
 * panel的屬性設定：
 * 
 * 1. Layout -> FlowLayout
 * ===============================================
 * panel_1的屬性設定：
 * 
 * 1. Layout -> FlowLayout
 * ===============================================
 * btnPrevious的屬性設定
 * 
 * 1. icon -> arrowLeft.png
 * ===============================================
 * btnNext的屬性設定
 * 
 * 1. horizontalTextPosition -> LEFT
 * 2. icon -> arrowRight.png
 * ===============================================
 * lblShowImage的屬性設定
 * 1. icon -> pic0.jpg
 * 2. horizontalTextPosition -> CENTER
 * 3. verticalTextPosition -> BOTTOM
 * 
 * 本範例為點擊按鈕後，會顯示不同的圖片。
 */

package ch23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class App23_4 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnPrevious;
	private JButton btnNext;
	private JPanel panel_1;
	private JLabel lblShowImage;
	
	//用來存放4張圖片的ImageIcon陣列
	private static ImageIcon pic[] = new ImageIcon[4];
	//用來記錄目前圖片的index是多少
	private static int imageNowIndex = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App23_4 frame = new App23_4();
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
	public App23_4() {
		setTitle("JButton&JLabel");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 444, 45);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//載入圖片並且存放至pic[]
		pic[0] = new ImageIcon("src\\ch23\\pic0.jpg");
		pic[1] = new ImageIcon("src\\ch23\\pic1.jpg");
		pic[2] = new ImageIcon("src\\ch23\\pic2.jpg");
		pic[3] = new ImageIcon("src\\ch23\\pic3.jpg");
		
		btnPrevious = new JButton("前一張");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//前一張按鈕的事件處理
				//圖片現在的index大於0才能夠顯示前一張圖片
				if(imageNowIndex > 0)
				{
					imageNowIndex-=1;
					lblShowImage.setText(String.format("pic%d.png", imageNowIndex));
					lblShowImage.setIcon(pic[imageNowIndex]);
				}
			}
		});
		btnPrevious.setIcon(new ImageIcon(App23_4.class.getResource("/ch23/arrowLeft.png")));
		panel.add(btnPrevious);
		
		btnNext = new JButton("下一張");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//下一張按鈕的事件處理
				//先取得pic[]的長度
				int picArrayLength = pic.length;
				
				//圖片現在的index必須小於pic[]的最大index才能顯示下一張圖片
				if(imageNowIndex < (picArrayLength - 1))
				{
					imageNowIndex+=1;
					lblShowImage.setText(String.format("pic%d.png", imageNowIndex));
					lblShowImage.setIcon(pic[imageNowIndex]);
				}
			}
		});
		btnNext.setHorizontalTextPosition(SwingConstants.LEFT);
		btnNext.setIcon(new ImageIcon(App23_4.class.getResource("/ch23/arrowRight.png")));
		panel.add(btnNext);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 46, 444, 279);
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblShowImage = new JLabel("Show Image");
		lblShowImage.setFont(new Font("新細明體", Font.BOLD, 18));
		lblShowImage.setHorizontalTextPosition(SwingConstants.CENTER);
		lblShowImage.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblShowImage.setIcon(new ImageIcon(App23_4.class.getResource("/ch23/pic0.jpg")));
		panel_1.add(lblShowImage);
	}
}
