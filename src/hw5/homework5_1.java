package hw5;

import java.util.Scanner;

public class homework5_1 {
	public static void main(String[] main) {
		int[] sum = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入兩組整數");
		for(int i =0; i < 2 ;i++) {
			sum[i] = sc.nextInt();
		};
		int weight = sum[1];
		int height = sum[0];
		
		String resault = starSquare(weight,height);
		System.out.println(resault);
		
	}
	
	public static String starSquare(int weight,int height) {
		String star ="";
		for(int i =0; i< weight ; i++) {
			for(int j = 0; j < height ;j++) {
				star = star + "*";
			}
			star = star + "\n";
		}
		return star;
		
	}
	

}
