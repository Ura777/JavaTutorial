/*
 * JList與JScrollPane
 * 
 * JList的選項可供複選或是放入圖形，這是AWT的List所做不到的功能。
 * 
 * 傾聽介面：ListSelectionListener
 * 觸發事件：ListSelectionEvent
 * 覆寫方法：valueChanged()
 * 
 * 將JList放入JScrollPane內後，當選項超出JList可視範圍時，會自動出現捲軸。
 * 放置的區域為scrollPane的ViewportView區域。
 * =============================================================
 * contentPane的屬性設定：
 * 
 * 1. Layout -> absolute
 * =============================================================
 * btnGetColors的屬性設定：
 * 
 * 1. font -> Arial, BOLD, 18
 * =============================================================
 * scrollPane的屬性設定：
 * 
 * 1. visible -> false
 * =============================================================
 * list的屬性設定：
 * 
 * 1. font -> Arial, BOLD, 18
 * 2. selectionModel -> SINGLE_SELECTION
 * =============================================================
 * 新增選項至list：
 * 
 * 1. 尋找list的model屬性，找到後點擊右邊的「...」按鈕開啟選項輸入視窗。
 * 2. 開始出入選項，輸入完1個選項後請按Enter換行，然後再繼續輸入第2個選項。
 * 3. 全部的選項都輸入完成後，按下OK按鈕，即可完成。
 * =============================================================
 * list的事件處理：
 * 
 * 1. 點選右邊Properties視窗的第一個Show Events圖示
 * 2. 找到listSelect選項後，將之展開。
 * 3. 雙擊valueChanged後，將會自動跳轉至Source頁面。
 * 4. WindowBuilder會自動產生註冊傾聽器的程式碼，之後就將事件處理的程式碼寫在valueChanged()內。
 * 
 * 本範例為按下按鈕後可以取得顏色清單，點選顏色清單上的選項後，list的背景顏色將會被改成所選擇的顏色。
 */
package ch23;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class App23_6 extends JFrame {

	private JPanel contentPane;
	private final JScrollPane scrollPane = new JScrollPane();
	private JButton btnGetColors;
	private JList<String> list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App23_6 frame = new App23_6();
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
	public App23_6() {
		setTitle("JList Demo");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 166);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		scrollPane.setVisible(false);
		scrollPane.setBounds(0, 0, 273, 98);
		contentPane.add(scrollPane);
		
		list = new JList<String>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) 
			{
				//JList的事件處理
				//取得目前被選取的選項index
				int chooseOptionIndex = list.getSelectedIndex();
				
				//根據chooseOptionIndex來選擇list的背景顏色
				switch(chooseOptionIndex)
				{
					case 0:
						list.setBackground(Color.RED);
						break;
					case 1:
						list.setBackground(Color.GREEN);
						break;
					case 2:
						list.setBackground(Color.BLUE);
						break;
					case 3:
						list.setBackground(Color.PINK);
						break;
					case 4:
						list.setBackground(Color.YELLOW);
						break;
					case 5:
						list.setBackground(Color.CYAN);
						break;
					case 6:
						list.setBackground(Color.GRAY);
						break;
					case 7:
						list.setBackground(Color.MAGENTA);
						break;
				}
			}
		});
		list.setFont(new Font("Arial", Font.BOLD, 18));
		
		/*以下為透過設定屬性model後，自動產生的程式碼。*/
		list.setModel(new AbstractListModel<String>() 
		{
			String[] values = new String[] {"RED", "GREEN", "BLUE", "PINK", "WELLOW", "CYAN", "GRAY", "MAGENTA"};
			
			public int getSize() 
			{
				return values.length;
			}
			
			public String getElementAt(int index) 
			{
				return values[index];
			}
		});
		/*以上為透過設定屬性model後，自動產生的程式碼。*/
		
		scrollPane.setViewportView(list);
		
		btnGetColors = new JButton("Get Colors");
		btnGetColors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//按鈕的事件處理
				//將scrollPane顯示出來
				scrollPane.setVisible(true);
			}
		});
		btnGetColors.setFont(new Font("Arial", Font.BOLD, 18));
		btnGetColors.setBounds(0, 100, 273, 41);
		contentPane.add(btnGetColors);
	}
}
