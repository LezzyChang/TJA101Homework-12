package hw3;

import java.util.Scanner;

public class homework3_3 {
	
	public static void main(String[] args){
		System.out.println("請輸入0~9的數字");
		int data;
		int ra ;
		ra =(int)(Math.random() *11);
		do {
			Scanner num = new Scanner(System.in);
			data = num.nextInt();
			
			if (ra == data) {
				System.out.println("答對囉AAAA");
			}else {
				System.out.println("答錯了喔aaaa");
			}
		}while(ra != data);
		
		
	}
	public static void choose(int data) {
	
	}
}
