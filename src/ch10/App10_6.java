/*
 * 以Super Class的變數存取Sub Class物件的成員 - 另外一個範例
 * 請搭配SuperShpae與SubCircle、SubSquare、SubTriangle。
 * 
 * 如果是好幾個Sub Class同時繼承一個Super Class，
 * 並且共同改寫Super Class的某個Method時，
 * 使用這種方式將會非常的方便。
 * 
 */

package ch10;

public class App10_6 
{

	public static void main(String[] args) 
	{
		//建立SuperShape的陣列
		SuperShape shape[] = new SuperShape[5];
		
		//陣列內分別存放3個子類別的物件
		shape[0] = new SubCircle(12.0);
		shape[1] = new SubCircle(21.0);
		shape[2] = new SubSquare(15);
		shape[3] = new SubTriangle(12.0, 7.0);
		shape[4] = new SubTriangle(3.0, 18.0);
		
		//呼叫SuperShape的largest()找出最大的面積
		SuperShape.largest(shape);

	}

}
