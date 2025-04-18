package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Caculator c = new Caculator();
		Scanner sc =new Scanner(System.in);
		
		try {
			System.out.print("請輸入 x：");
			int x = sc.nextInt();
			System.out.print("請輸入 y:");
			int y = sc.nextInt();
			c.powerXY(x,y);			
		}catch (InputMismatchException e) {
			//這邊如果偵測到輸入的格式錯誤，會列印出以下這段
			System.out.println("輸入格式不正確");
		}catch(CalException e1) {
			//這邊偵測自訂例外機制，使用e1.getMessage()讀訊息
			System.out.println(e1.getMessage());
		}
		
		
	}

}
