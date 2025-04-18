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
			System.out.println("輸入格式不正確");
		}catch(CalException e1) {
			System.out.println(e1.getMessage());
		}
		
		
	}

}
