package hw6;
//宣告這是一個自訂例外機制，extend是繼承Exception
public class CalException extends Exception {
//自訂例外機制
	public CalException(String message) { 
		//(Sting message)可以給這個例外一個錯誤訊息
		super(message); //把訊息傳給父類別(Exception)儲存
	}
	
}
