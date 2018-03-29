/*
 * 檔案處理
 * 請搭配train.txt。
 * 請將train.txt放置於src/ch14/底下。
 * train.txt的編碼為utf-8。
 * 
 * Java是以串流(Stream)的方式來處理輸入輸出。
 * 
 * 串流(Stream)
 * 串流內的資料是由字元(Characters)與位元(Bits)組成。
 * 
 * 串流可以分為輸入串流(Input Stream)跟輸出串流(Output Stream)。
 * java.io類別庫所提供的Class可以處理串流。
 * 
 * InputStream與OutputStream Class通常用來處理位元串流(Bit Stream)，
 * 也就是二進位檔案(Binary File)，但是也可以處理純文字檔。
 * 
 * Reader與Writer Class通常用來處理字元串流(Character Stream)，
 * 也就是純文字檔(Text File)。
 * 
 * 一般來說，我們並不會直接去使用上處提到的Class，
 * 而是會去使用根據上述Class衍生出的Sub Class，
 * 透過產生Sub Class的物件來進行檔案處理。
 * 
 * 檔案處理完後，一定要記得呼叫close()關閉檔案。
 * 
 * FileReader繼承自InputStreamReader，
 * 而InputStreamReader繼承自Reader。
 * 
 * 本範例為FileReader讀取檔案。
 */

package ch14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App14_1 
{

	public static void main(String[] args) 
	{
		//宣告檔案路徑與檔案名稱
		//這種檔案路徑稱為相對路徑
		String filePath = "src/ch14/";
		String fileName = "train.txt";
		//宣告可存入128個字元的陣列，用來當作讀取檔案後存放資料。
		char data[] = new char[128];
		
		try 
		{
			//建立FileReader物件並指向要讀取的檔案
			//有可能會產生FileNotFoundException
			FileReader fr = new FileReader(filePath + fileName);
			
			//讀取檔案
			//有可能會產生IOException
			int characterNum = fr.read(data);
			
			//利用data[]內的字元建立String物件
			String content = new String(data, 0, characterNum);
			
			//印出結果
			System.out.println("Characters read = " + characterNum);
			System.out.println(content);
			
			//關閉被讀取的檔案
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
