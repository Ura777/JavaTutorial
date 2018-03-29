/*
 * 使用FileWriter Class將資料寫入檔案
 * 
 * FileReader跟FileWriter都屬於沒有緩衝區(Buffer)的檔案處理方式，
 * 因此是直接跟檔案進行輸入與輸出，效率比較差，使用的便利性也不好。
 */

package ch14;

import java.io.FileWriter;
import java.io.IOException;

public class App14_2 
{

	public static void main(String[] args) 
	{
		String filePath = "src/ch14/";
		String fileName = "proverb.txt";
		//宣告要寫入的資料
		char data[] = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!', '\n'};
		String endData = "End of file";
		
		try 
		{
			FileWriter fw = new FileWriter(filePath + fileName);
			
			//寫入資料
			fw.write(data);
			fw.write(endData);
			
			fw.close();
			
			//印出提示訊息
			System.out.println("檔案寫入完成！");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
