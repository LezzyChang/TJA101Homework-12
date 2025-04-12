package hw3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class homework3_2 {
	public static void main(String[] args) {
//		triangle aa = new triangle();
//		int[] tr = aa.get3Number();
//		
//		aa.select(tr);
//	}
//
//	// ========================================
//	public int[] get3Number() {
		int data[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入3個整數");
		for (int j = 0; j < data.length; j++) {
			data[j] = sc.nextInt();
		}
		Arrays.sort(data);
		System.out.print(Arrays.toString(data));
		System.out.println();
		sc.close();
		select(data);
	}

	// =======================================
	public static void select(int[] data) {

		if (data[0] + data[1] <= data[2] || data[0] + data[2] <= data[1] || data[1] + data[2] <= data[0]) {
			System.out.println("你這輸入不能成立三角形:D");
			return;
		}
		if (data[0] == data[1] && data[0] == data[2]) {
			System.out.println("正三角形");
		}

		else if (data[0] == data[1] || data[0] == data[2] || data[1] == data[2]) {
			System.out.println("等腰三角形");
		} else if ((Math.pow(data[0], 2) + Math.pow(data[1], 2)) == Math.pow(data[2], 2)) {
			System.out.print("直角三角形");
		} // Math.pow使用在平方上
		else {
			System.out.println("一般三角形");
		}
	}
}