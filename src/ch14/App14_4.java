/*
 * 使用BufferWriter Class將資料寫入檔案
 */

package ch14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App14_4 
{

	public static void main(String[] args) 
	{
		String filePath = "src/ch14/";
		String fileName = "random.txt";
		
		try 
		{
			FileWriter fw = new FileWriter(filePath + fileName);
			BufferedWriter bfw = new BufferedWriter(fw);
			
			for(int i=1; i<=5; i++)
			{
				//將亂入寫入到緩衝區
				bfw.write(Double.toString(Math.random()));
				//將換行符號(\n)寫入到緩衝區
				bfw.newLine();
			}
			System.out.println("亂入寫入完成！");
			
			bfw.close();
			fw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
