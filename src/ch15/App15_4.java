/*
 * 執行緒的生命週期
 * 請搭配Test4。
 * 
 * Thread的狀態有以下的5種：
 * 
 * <產生新的(Newly Created)>
 * 使用new thread()建立物件時，
 * 就會進入這個狀態，
 * 直到呼叫start()才會進入可執行的狀態。
 * 
 * <可執行的(Runnable)>
 * 此時最先搶到CPU資源的Thread，
 * 就會先開始執行run()，
 * 進入執行中的狀態，
 * 其餘的Thread便會在佇列(Queue)中等待爭取CPU的資源。
 * 
 * <執行中的(Running)>
 * 一旦Thread開始執行run()，就會進入此狀態。
 * 此外，1次只會有1個Thread處於此狀態中。
 * 
 * <被凍結的(Blocked)>
 * 當進入此狀態後便會停止run()的執行，
 * 直到被凍結的因素消失後，
 * Thread會回到Runnable狀態。
 * --------------------------------------------
 * 發生下列事情時，Thread將會進入此狀態：
 * 1.Thread呼叫物件的wait()。
 * 2.Thread本身呼叫sleep()。
 * 3.Thread與另外1個Thread join()在一起時。
 * --------------------------------------------
 * 被凍結的因素消失的原因有以下2點：
 * 1.如果Thread是由呼叫物件的wait()所凍結，
 *   那麼呼叫該物件的notify()即可解除。
 * 2.Thread的指定睡眠時間結束。
 * --------------------------------------------
 * sleep(long millis)：
 * 可以用來設定睡眠，睡眠的時間單位為毫秒，也就是1/1000秒。
 * 因為有可能會被中斷，被中斷時會拋出InterruptedException，
 * 所以sleep(long millis)一定要做例外處理。
 * --------------------------------------------
 * 當某個Thread呼叫join()時，
 * 原來正在執行的Thread或是程式碼都會先暫停，
 * 等到某個呼叫join()的Thread結束後才會繼續再執行被暫停的Thread或是程式碼。
 * 
 * <銷毀的(Dead)>
 * 當Thread的run()結束，或是由Thread呼叫它的stop()時，
 * 就會進入此狀態。
 * 一旦Thread處於此狀態，那個這個Thread將無法再次啟動。
 * 
 * 本範例為sleep()的示範。
 */

package ch15;

public class App15_4 
{

	public static void main(String[] args) 
	{
		Test4 dog = new Test4("Doggy");
		Test4 cat = new Test4("Kitty");
		
		dog.start();
		cat.start();

	}

}
