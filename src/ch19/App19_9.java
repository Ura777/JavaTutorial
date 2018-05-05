/*
 * 檔案對話方塊 File Dialog
 * 
 * 專門用來處理檔案存取的相關事務。
 * 因為繼承自Dialog類別，因此使用方式與Dialog沒有太大的差異。
 */

package ch19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SuppressWarnings("serial")
public class App19_9 extends Frame implements ActionListener
{
	static App19_9 frm = new App19_9();
	static Button btnOpen = new Button("Open");
	static TextArea txarShowFileContent = new TextArea();
	//宣告FileDialog物件fdlg
	//引數為Owner,檔案對話方塊的標題
	//此建構元建好的檔案對話方塊為讀取用的檔案對話方塊
	FileDialog fdlg = new FileDialog(frm, "Open File");

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		BorderLayout br = new BorderLayout();
		frm.setLayout(br);
		frm.setTitle("App19_9");
		frm.setLocation(250, 250);
		frm.setSize(200, 150);
		
		//註冊傾聽者為frm
		btnOpen.addActionListener(frm);
		
		frm.add(txarShowFileContent, br.CENTER);
		frm.add(btnOpen, br.SOUTH);
		frm.setVisible(true);
		
		frm.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				frm.dispose();
			}
		});
		
	}

	//open按鈕的事件處理
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		fdlg.setVisible(true);
		
		/*
		 * 以下程式碼是按下檔案對話方塊的開起按鈕後才會執行
		 */
		//取得檔案的路徑與名稱
		String fileName = fdlg.getDirectory() + fdlg.getFile();
		try 
		{
			//讀取檔案
			FileInputStream fi = new FileInputStream(fileName);
			//宣告位元陣列data
			byte data[] = new byte[fi.available()];
			//將檔案內容讀進位元陣列data中
			fi.read(data);
			//用txarShowFileContent顯示位元陣列data的內容
			txarShowFileContent.setText(new String(data));
			//關閉讀取的檔案
			fi.close();
		} 
		catch (FileNotFoundException fnfe) 
		{
			fnfe.printStackTrace();
		}
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
		}
	}

}
