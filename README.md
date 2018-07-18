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
	 
  * 到WindowBuilder的下載頁面複製相對應版本的link  
 
        http://download.eclipse.org/windowbuilder/WB/integration/4.7/
 
  * 上方選單點選Help &gt; Install New Software... &gt; 在Work with:後方的輸入框貼上剛才複製的link &gt; 點選Select All按鈕
  * 一直點選Next按鈕 &gt; 點選 I accept the terms of the license agreement選項 &gt; 點選Finish按鈕
  * 安裝完畢後點選Yes按鈕，Eclipse將會自動重新啟動。
* * *
