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
* 更改編碼
  * 上方選單點選Window &gt; Preferences &gt; General &gt; Workspace
  * 最下方的Texfile encoding區塊點選Other &gt; 選擇UTF-8 &gt; 按下Apply and Close按鈕
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
## Ch05 - 選擇性結構、迴圈
* 選擇性結構
  * if
  * if else
  * 巢狀if
  * 條件運算子
    * ?:
* 迴圈
  * for
  * while
  * do while
  * 無窮迴圈
  * 巢狀迴圈
  * 迴圈的跳脫
    * break
	* continue
* 更好用的多重選結構
  * switch case
* * *
## Ch06 - 陣列
* 一維陣列
* 二維陣列
* 多維陣列
* 陣列內數值的比大小
* 比較陣列與陣列之間的參考位址
* * *
## Ch07 - 方法
* 方法(Method)又稱之為函數(Function)
* 有或是沒有引數的方法
* 有或是沒有回傳的方法
* 傳值(Pass by Value)
* 傳址、傳參照(Pass by Reference)
* 遞迴(Recursive)
  * 實作階乘函數(Factorial Function, n!)
* 多載(Overloading)
* * *
## Ch08 - 類別(基礎)
* 類別的英文為Class
* 資料成員(Data Member)
* 函數成員(Function Member)
* 建立物件與使用資料、函數成員
* 不同物件之資料成員在記憶體當中的配置關係
* 函數成員的多載
* 封裝(Encapsulation)
  * private
  * public
* * *
## Ch09 - 類別(進階)
* 建構元(Constructor)
* 建構元的多載
* 建構元之間的呼叫
  * this()
* 類別變數
  * static
* 物件陣列
* 內部類別(Inner Class)
* 匿名內部類別(Anonymous Inner Class)
* 巢狀類別(Nested Classes)
* * *
## Ch10 - 類別的繼承
* 1個子類別只能繼承1個父類別
* 繼承的關鍵字
  * extends
* 終止繼承的關鍵字
  * final
* 建構元的呼叫
  * 呼叫父類別：super()
  * 呼叫自己的：this()
* protected成員的使用
* 改寫、覆寫(Overriding)
* 終止覆寫的關鍵字
  * final
* 父類別變數存取子類別物件的成員
* 使用super來存取父類別的變數
* 物件類別(Object Class)
  * getClass()
  * equlas()
  * toString()
* * *
## Ch11 - 抽象類別、介面
* 抽象類別的英文為Abstract Class
* 只能利用繼承才能透過子物件產生物件
* 抽象類別的內容
  * 資料成員
  * 函數成員
  * 抽象函數(Abstract Method)
* 抽象函數
  * 在抽象類別中只定義資料型態、函數名稱、需要用到的引數
  * 透過子類別的繼承來覆寫抽象含數，並且定義函數的處理方式。
  * 宣告方式
    * 不宣告
	* public
	* protected
* 利用抽象類別的變數、陣列變數來存取子類別物件的成員
* 介面的英文為Interface
* 介面可以實現多重繼承
* 介面的撰寫規則如下：
  * 資料成員皆為常數
    * final可以省略不寫
  * 函數成員皆為抽象函數
    * 宣告方式
	  * 不宣告
	  * public
* 只能透過介面的實作來產生物件
* 介面的實作之關鍵字
  * implements
* 利用介面形態的變數、陣列變數來存取物件
* 多重繼承的實作
* 介面的延伸
  * 介面可以繼承自多個介面
  * 介面繼承的關鍵字
    * extends
* 類別關係的判斷
  * instanceof
* * *
## Ch12 - Package、常用的類別庫
* 檔案的分割
* package的使用
* 存取不同的package的類別
* 匯入package
  * 匯入的關鍵字
    * import
* package的階層關係
* String類別庫
* String Buffer類別庫
* Wrapper類別
  * Boolean
  * Character
  * Short
  * Integer
  * Long
  * Float
  * Double
* Math類別
* * *
## Ch13 - 例外處理
* 例外的英文為Exception
* 產生例外的常見情況
  * 要開啟的檔案不存在
  * 陣列的索引值超出範圍
  * 使用者輸入的資料之型態與程式設計師所預期的不同
  * 整數除以0
* 使用關鍵字try、catch、finally進行例外處理
* 例外類別
  * 繼承自Throwable
  * 常見的類別
    * RuntimeException
	  * IndexOutOfBoundsException
	  * ArithmeticException
	* IOException
* 例外的捕捉
* 拋出例外
  * 在程式中拋出使用關鍵字：throw
  * 指定函數拋出使用關鍵字：throws
* 從不同類別內的函數拋出例外
* 撰寫並且拋出自訂的例外類別
* 輸入型態不合的例外處理
  * 拋出InputMismatchException類別
* * *
## Ch14 - 檔案處理
* Java以串流(Stream)的方式來處理輸入與輸出
* 檔案處理完後一定要記得呼叫close()
* 直接針對檔案進行處理
  * 讀取：FileReader
  * 寫入：FileWriter
* 利用緩衝區(Buffer)進行檔案的處理
  * 讀取：BufferReader
  * 寫入：BufferWriter
* 利用串流進行檔案處理
  * 讀取：FileInputStream
  * 寫入：FileOutputStream
* * *
## Ch15 - 多執行緒
* 執行緒的英文為Thread
* 執行緒的使用
  * start()
* 實作Runnable介面來建立執行緒
  * 需要覆寫run()
* 執行緒的生命週期
  * 執行緒的5種狀態
    * 產生新的(Newly Created)
	* 可執行的(Runnable)
	* 執行中的(Running)
	* 被凍結的(Blocked)
	  * wait()
	  * sleep()
	    * 有可能會被中斷，中斷時拋出InterruptedException。
	  * join()
	    * 有可能會被中斷，中斷時拋出InterruptedException。
	* 銷毀的(Dead)
* 執行緒的優先順序
  * 以數字1~10表示
  * 數字越大代表優先權越高
* 同步處理(Synchronized)
  * 在函數前方加上關鍵字synchronized
  * 又稱為鎖定機制
  * 請小心產生死結(Deadlock)的可能性
* * *
## Ch16 - 集合物件
* 集合(Collection)內的資料稱之為元素(Element)
* 泛型(Generic)
  * <T>
* 集合的特性
  * 自動排序
  * 重複
  * 順序、次序
  * 使用關鍵值(Key)
* 實作集合的子介面
  * Set
  * List
  * Map
* 實作Set介面的物件
  * HashSet
  * TreeSet
* 實作List介面的物件
  * LinkedList
  * ArrayList
* 實作Map介面的物件
  * HashMap
  * TreeMap
* 走訪集合物件之元素的3種方法
  * for-each迴圈
    * 只能從起始處開始走訪
  * Iterator介面
    * 只能從起始處開始走訪
    * 適用於Map以外的集合物件
  * ListIterator介面
    * 可以雙向走訪
* * *
## Ch17 - AWT視窗物件
* AWT、Swing的介紹與比較
* 建立並且使用視窗物件
  * Container
  * Frame
* 建立、使用標籤物件
  * Label
* 建立、使用按鈕物件
  * Button
* 建立、使用選取方塊物件
  * Checkbox
  * 使用CheckboxGroup來達到單選的效果
* 建立、使用文字輸入方塊物件
  * TextField
* 建立、使用文字輸入區域物件
  * TextArea
* 版面配置
  * Layout
    * BorderLayout
	* CardLayout
	* FlowLayout
	* GirdLayout
* * *
## Ch18 - 事件處理
* 委派事件模式(Delegation Event Model)
  * 事件發生來源
  * 訊息
  * 事件傾聽者
  * 事件傾聽者必須要先向產生事件的物件進行註冊
* 定義內部類別並且產生暱名物件當作傾聽者
* 事件的分類
  * 語意事件(Semantic Events)
    * ActionEvent
  * 低階層事件(Low-Level Events)
    * WindowEvent
	* KeyEvent
* 按下Button
  * 發生事件：ActionEvent
  * 實作介面：ActionListener
  * 覆寫函數：actionPerformed()
    * 取得事件發生來源的物件：getSource()
	* 取得事件發生時所按下的按鍵數值：getModifers()
* 勾選Checkbox
  * 發生事件：ItemEvent
  * 實作介面：ItemListener
  * 覆寫函數：itemStateChanged()
* TextField、TextArea的文字改變時
  * 發生事件：TextEvent
  * 實作介面：TextListener
  * 覆寫函數：textValueChanged()
* 按下鍵盤上的按鍵
  * 發生事件：KeyEvent
  * 實作介面：KeyListener
  * 覆寫函數
    * keyPressed()
	* keyReleased()
	* keyTyped()
* 使用KeyAdapter類別處理KeyEvent
* 點擊左鍵、右鍵、滾輪或是移出、移入事件發生來源
  * 發生事件：MouseEvent
  * 實作介面：MouseListener
  * 覆寫函數
    * mousePressed()
    * mouseReleased()
    * mouseClicked()
    * mouseEntered()
    * mouseExited()
* 移動、拖曳滑鼠
  * 發生事件：MouseEvent
  * 實作介面：MouseMotionListener
  * 覆寫函數
    * mouseDragged()
    * mouseMoved()
* 使用MouseAdapter類別處理MouseEvent
* 使用MouseMotionAdapter類別處理MouseEvent
* 建立、關閉視窗或縮小至工具列
  * 發生事件：WindowEvent
  * 實作介面：WindowListener
  * 覆寫函數
    * windowActivated()
    * windowClosed()
    * windowClosing()
    * windowDeactivated()
    * windowDeiconified()
    * windowIconified()
    * windowOpend()
* 使用WindowAdapter類別處理WindowEvent
* * *
## Ch19 - AWT的其他物件
* 建立、使用選擇表單物件
  * List
  * 事件處理
    * 發生事件：ItemEvent
    * 實作介面：ItemListener
	* 覆寫函數：itemStateChanged()
* 建立、使用下拉式選單物件
  * Choise
  * 事件處理
    * 發生事件：ItemEvent
    * 實作介面：ItemListener
	* 覆寫函數：itemStateChanged()
* 建立、使用功能表物件
  * 由MenuBar、Menu、MenuItem組成
  * 事件處理
    * 發生事件：ActionEvent
    * 實作介面：ActionListener
    * 覆寫函數：actionPerformed()
* 建立、使用捲軸物件
  * ScrollBar
  * 事件處理
    * 發生事件：AdjustmentEvent
    * 實作介面：AdjustmentListener
    * 覆寫函數：adjustmentValueChanged()
* 建立、使用對話方塊物件
  * Dialog
  * 需要指定擁有者(Owner)
  * 需要呼叫setVisible(true)才會顯示
* 建立、使用檔案對話方塊物件
  * FileDialog
  * 需要指定擁有者(Owner)
  * 需要呼叫setVisible(true)才會顯示
  * 專門用來處理檔案存取的相關事務
* * *

## Ch20 - AWT的繪圖
* Java中的座標軸系統
  * 向右為X軸正方向
  * 向下為Y軸正方向
* Graphisc類別
* paint()的使用
* 繪製文字
  * dragString()
* RGB的進階應用
* brighter()、darker()的使用
* update()的使用
* 繪製填滿色彩的弧形
  * fillArc()
* 繪製填滿色彩與有邊框的多邊形
  * fillPolygon()
  * drawPolygon()
* 使用滑鼠手繪圖形
  * drawLine()
* 用滑鼠移動圖形
* * *








