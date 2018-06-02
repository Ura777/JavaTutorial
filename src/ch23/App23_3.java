/*
 * ImageIcon與JButton
 * 
 * 利用ImageIcon的建構元讀取圖檔，之後再將此物件傳遞給JButton進行設定，
 * 就可以產生有影像圖示的按鈕了。
 * ============================================================
 * contentPane的屬性設定：
 * 
 * 1. Layout -> FlowLayout
 * ============================================================
 * btnJbutton的屬性設定：
 * 
 * 1. icon -> icon01.png
 * 2. pressedIcon -> icon02.png
 * 3. rolloverIcon -> icon03.png
 * 4. rolloverEnabled -> true
 * ============================================================
 * 選擇圖片的步驟(以設定icon屬性為例)
 * 
 * 1. 先將圖片放入置JavaTutorial\src\ch23
 * 2. 進入Eclipse，後對PackageExplorer重新整理。
 * 3. 點選Design介面，點選已經放在JFrame裡的JButton元件。
 * 4. 到右邊的Properties視窗點選倒數第2個Show Advanced Properties圖示。
 * 5. 尋找icon屬性，找到後點選右邊「...」的圖示。
 * 6. 選擇第1個選項Classpath resource(don't forget to refresh project before)
 * 7. 到下方的Parameters依序點選src、ch23、icon01.png。
 * 8. 最後按下OK
 * 
 * 本範例為按鈕的圖示會隨著滑鼠指標位置的不同與點擊按鈕時，會顯示不同的圖示。
 */

package ch23;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class App23_3 extends JFrame {

	private JPanel contentPane;
	private JButton btnJbutton;
	
	//使用程式碼的方式設定
	//取得一般、滑鼠指標在按鈕上時、滑鼠按下按鈕時的圖案。
	/*
	static ImageIcon generalIcon = new ImageIcon("src\\ch23\\icon01.png");
	static ImageIcon rollOverIcon = new ImageIcon("src\\ch23\\icon02.png");
	static ImageIcon pressedIcon = new ImageIcon("src\\ch23\\icon03.png");
	*/

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App23_3 frame = new App23_3();
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
	public App23_3() {
		setTitle("JButton測試");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnJbutton = new JButton("JButton");
		
		/*以下為使用Design介面直接設定後產生的程式碼*/
		btnJbutton.setIcon(new ImageIcon(App23_3.class.getResource("/ch23/icon01.png")));
		btnJbutton.setRolloverIcon(new ImageIcon(App23_3.class.getResource("/ch23/icon02.png")));
		btnJbutton.setPressedIcon(new ImageIcon(App23_3.class.getResource("/ch23/icon03.png")));
		/*以上為使用Design介面直接設定後產生的程式碼*/
		
		contentPane.add(btnJbutton);
		
		//使用程式碼的方式設定
		//要將RolloverEnabled設定為true
		//之後再設定一般、滑鼠指標在按鈕上時、滑鼠按下按鈕時的圖案。
		/*
		btnJbutton.setIcon(generalIcon);
		btnJbutton.setRolloverIcon(rollOverIcon);
		btnJbutton.setPressedIcon(pressedIcon);
		*/
		
	}

}
