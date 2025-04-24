package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework7_1 {
	public static void main(String[] args) throws IOException {
		//建立一個filename變數，儲存檔案的名稱為Sample.txt
		String filename = "Sample.txt";
		
		//建立File物件並塞入filename
		File file = new File(filename);
		long byteCount = file.length(); //宣告long並塞入file的位元組數
		System.out.print("Sample.txt檔案共有"+byteCount+"個位元組");

		int charCount = 0;
		int lineCount = 0;
		
		//try這邊利用BufferedReader實作了AutoCloseable介面，主要是要來建立一個支援自動關閉close()的物件
		//第一層：先用FileInputStream讀取資料，
		//第二層：再用InputStreamReader將FileInput包住，並且使用編碼解碼UTF-8防止中文亂碼
		//第三層：利用建立物件BufferReader來實作AutoCloseable介面
		//BufferReader -> 繼承Reader -> 實作Closeable -> 間接實做了AutoCloseable
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {
			String line;
			//宣告一個line字串,用reader呼叫readLine方法再指定給line，
			//並且偵測裡內是否不為空值，再進行裡面的程序
			while ((line = reader.readLine()) != null) {
				lineCount++; //這邊就新增行數數量
				charCount += line.length(); //將line讀取到的那一行字元加在charCount
			}
			System.out.print(","+charCount+"個字元");
			System.out.print(","+lineCount+"列資料");
		}

	}

}
