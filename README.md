# JavaTutorial
## 環境設置
* 作業系統 = Windows 7
* JDK版本 = 1.8.0_171
* Eclipse版本 = Eclipse IDE for Java Developers最新版本
* * *
## Java環境變數設置
* 取得並複製JDK安裝路徑  
 
        C:\Program Files\Java\jdk1.8.0_162
 
* 控制台 &gt; 所有控制台項目 &gt; 系統 &gt; 點選右邊的進階系統設定 &gt; 點選上方的進階標籤 &gt; 環境變數
* 在Administrator的使用者變數(U)區塊中點選新增按鈕，根據對應的欄位輸入以下的資料：  
 
    | 欄位名稱      | 輸入內容                            |
    |:-------------:|:-----------------------------------:|
    | 變數名稱(N)   | JAVA_HOME                           |
    | 變數值(V)     | C:\Program Files\Java\jdk1.8.0_162  |
 
* 在系統變數(S)的區塊中點選變數名稱為Path的選項 &gt; 點選編輯按鈕
* 按下鍵盤的右方向鍵 &gt; 輸入分號 &gt; 輸入以下內容：  
 
        %JAVA_HOME%\bin;
 
* 輸入完之後，一直按下確定按鈕。
* 打開命令提示字元視窗，輸入以下指令後按下Enter：  
 
        java
 
* 出現列表Java的功能列表，代表環境變數設置成功。
* * *
## Eclipse相關設定
* 更改字體大小
  * 上方選單點選Window &gt; Preferences &gt; General &gt; Appearance &gt; Color and Font
  * 右邊視窗點選Basic &gt; Text Font &gt; 點選右邊的Edit按鈕
  * 修改完成後點選Apply and Close按鈕
* 安裝WindowBuilder套件
  * 查詢Eclipse的版本
    * 上方選單點選Help &gt; About Eclipse &gt; 查看Version項目的資訊  
	 
	        Version: Oxygen.2 Release (4.7.2)
	 
  * 到WindowBuilder的[下載頁面](http://www.eclipse.org/windowbuilder/download.php "Installing WindowBuilder Pro | Teh Eclipse Foundation")複製相對應版本的link  
 
        http://download.eclipse.org/windowbuilder/WB/integration/4.7/
 
  * 上方選單點選Help &gt; Install New Software... &gt; 在Work with:後方的輸入框貼上剛才複製的link &gt; 點選Select All按鈕
  * 一直點選Next按鈕 &gt; 點選 I accept the terms of the license agreement選項 &gt; 點選Finish按鈕
  * 安裝完畢後點選Yes按鈕，Eclipse將會自動重新啟動。
* WindowBuilder的相關設定
  * 上方選單點選Window &gt; Preferences &gt; WindowBuilder &gt; Swing &gt; Code Generation
  * 右邊的視窗尋找Variable generation:的區塊 &gt; 勾選Field &gt; 點選Apply and Close 按鈕
* * *
## 課程介紹
## Ch01 - 第1個Java程式
* Hello World!!!
* * *
## Ch02 - 基本介紹
* 介紹程式的架構
* 輸出結果
* 使用Main()的引數
* * *
## Ch03 - 變數與資料型態
* 變數的使用
* 整數設值的錯誤方式
* 各種整數型態的最大值
* 溢位與其之處理方式
* 字元型態
* 跳脫字元
* 浮點數型態與其之最大值、最小值
  * Float
  * Double
* 布林型態
* 型態轉換
  * 自動轉型
  * 強制轉型
* * *
## Ch04 - 運算子、運算元
* 指派運算子
  * =
* 一元運算子
  * 正號：+
  * 負號：-
  * Not、否定：!
  * 取1的補數：~
* 算術運算子
  * 加法
  * 減法
  * 乘法
  * 除法
  * 取餘數：%
* 關係運算子
  * 大於
  * 小於
  * 大於等於
  * 小於等於
  * 等於：==
  * 不等於：!=
* 遞增與遞減運算子
  * 遞增：++
  * 遞減：--
* 邏輯運算子
  * And、且、和：&&
  * Or、或是：||
* 括號運算子
  * ()
* 簡潔運算子
  * +=
  * -=
  * *=
  * /=
  * %=
* 運算子的優先順序、運算式的型態轉換
* * *
