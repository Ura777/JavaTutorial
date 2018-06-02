/*
 * JList連按兩下選項的事件處理
 * 
 * 雖然JList並沒有提供處理雙擊選項的事件處理，
 * 但是可以透過MouseListener來完成。
 * =============================================
 * Vector類別
 * 
 * 這次將會用Vector物件來儲存選單的內容。
 * 
 * Vector是可以放入任意型態的動態陣列，跟ArrayList很像。
 * 但是差別在於Vector是同步的，也就是不會有資源衝突。
 * =============================================
 * contentPane的屬性設定：
 * 
 * 1. Layout -> GridLayout
 * =============================================
 * listChoose與listShow的屬性設定：
 * 
 * 1. font -> Arial, BOLD, 18
 * 2. selectionModel -> SINGLE_SELECTION
 */

package ch23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class App23_7 extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JList<String> listChoose;
	private JList<String> listShow;
	
	//宣告用來儲存選項的向量物件v
	private static Vector<String> v = new Vector<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App23_7 frame = new App23_7();
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
	public App23_7() {
		setTitle("JList Demo2");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 134);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		listChoose = new JList<String>();
		listChoose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				//事件處理
				//如果是listChoose被按下
				if(e.getSource().equals(listChoose))
				{
					//如果連續被按了2次
					if(e.getClickCount() == 2)
					{
						//將被選取的選項標題儲存到v
						v.add(listChoose.getSelectedValue());
						//設定v為listShow的選單內容
						listShow.setListData(v);
					}
				}
			}
		});
		listChoose.setFont(new Font("Arial", Font.BOLD, 18));
		listChoose.setModel(new AbstractListModel<String>() {
			String[] values = new String[] {"RED", "GREEN", "BLUE", "PINK", "YELLOW", "CYAN", "GRAY"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		listChoose.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(listChoose);
		
		scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1);
		
		listShow = new JList<String>();
		listShow.setFont(new Font("Arial", Font.BOLD, 18));
		listShow.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(listShow);
	}

}
