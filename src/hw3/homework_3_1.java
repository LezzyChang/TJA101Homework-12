package hw3;

import java.util.Scanner;

public class homework_3_1 {
	//0~100亂數。每次猜都會提示你是大於還是小於正確答案，直到正確為止。
	public static void main(String[] args) {
		
		System.out.println("請輸入0~100的數字");
		int nm;  //先在外宣告
		int ra=(int)(Math.random() *100); //在迴圈之前先產生一個亂數
		
		do {
			Scanner sc = new Scanner(System.in); //輸入自己的答案
			nm = sc.nextInt();
			
			if( nm != ra) {
				if( nm > ra ) { //如果數字大於答案就會提示
					System.out.println("再小一點");
				}else { //再不是就是提另外一個
					System.out.println("再大一點");	
				}
			}else if(nm==ra){
				System.out.println("答對了");
				
			}	
		}while(ra != nm);
		
	}
	

}
