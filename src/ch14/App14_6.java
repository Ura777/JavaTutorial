/*
 * 讀取圖檔並且另存新檔
 * 請搭配Java_logo.png。
 * 請將Java_logo.png放置於src/ch14/底下。
 * 
 * 使用FileInputStream讀取圖檔
 * 使用FileOutputStream另存新檔
 * */

package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App14_6 
{

	public static void main(String[] args) 
	{
		String filePath = "src/ch14/";
		String fileName = "Java_logo.png";
		String newFileName = "My_logo.png";
		int fileSize = 0;
		
		try 
		{
			FileInputStream fi = new FileInputStream(filePath + fileName);
			FileOutputStream fo = new FileOutputStream(filePath + newFileName);
			
			fileSize = fi.available();
			byte byteData[] = new byte[fileSize];
			
			fi.read(byteData);
			//將byteData[]內的資料寫入My_logo.png
			fo.write(byteData);
			
			System.out.println("File size = " + fileSize + " Bytes");
			System.out.println("File copied and rename：" + newFileName);
			
			fo.close();
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
