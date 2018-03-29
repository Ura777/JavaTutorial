/*
 * 利用緩衝區讀取資料
 * 請搭配number.txt。
 * 請將number.txt放置於src/ch14/底下。
 * 
 * 緩衝區 Buffer
 * 可以當作程式與檔案之間存取的橋梁。
 * 
 * 優點
 * 因為這種處理方式不需要一直讀取硬碟，
 * 可以增加執行效率。
 * 
 * 缺點
 * Buffer會占用一部份的RAM，
 * 如果沒有關閉檔案或是系統當機，
 * 在Buffer內的資料將會全數清空。
 * 
 * BufferReader繼承自Reader。
 * 
 */

package ch14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App14_3 
{

	public static void main(String[] args) 
	{
		String filePath = "src/ch14/";
		String fileName = "number.txt";
		String line = "";
		int lineCount = 0;
		
		try 
		{
			FileReader fr = new FileReader(filePath + fileName);
			//產生BufferReader物件
			//由於引數是Reader物件，因此將fr傳入。
			BufferedReader bfr = new BufferedReader(fr);
			
			//如果讀取的這一行是null，就代表已經沒有資料可以讀取了。
			while((line = bfr.readLine()) != null)
			{
				//紀錄行數
				lineCount++;
				//印出讀取的內容
				System.out.println(line);
			}
			//印出紀錄行數的結果
			System.out.println("\n" + lineCount + " lines read.");
			
			//關閉緩衝區
			bfr.close();
			//關閉檔案
			fr.close();
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
