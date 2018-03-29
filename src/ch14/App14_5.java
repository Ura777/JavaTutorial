/*
 * 使用FileInputStream Class讀取檔案內容
 * 請搭配train.txt。
 * 請將train.txt放置於src/ch14/底下。
 * train.txt的編碼為utf-8。
 * 
 * FileInputStream繼承自InputStream，
 * 而InputStream繼承自Java.lang.Object。
 */

package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App14_5 
{

	public static void main(String[] args) 
	{
		String filePath = "src/ch14/";
		String fileName = "train.txt";
		int fileSize = 0;
		
		try 
		{
			FileInputStream fi = new FileInputStream(filePath + fileName);
			
			//取得所讀取資料所佔的位元組數，也就是幾個bytes。
			fileSize = fi.available();
			//宣告讀取資料時存放資料的byte[]
			byte byteData[] = new byte[fi.available()];
			
			//將讀取的資料寫道byteData[]
			fi.read(byteData);
			
			//印出結果
			System.out.println("File size = " + fileSize + " Bytes");
			System.out.println(new String(byteData));
			
			fi.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
