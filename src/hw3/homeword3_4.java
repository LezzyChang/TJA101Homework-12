package hw3;

import java.util.Scanner;

public class homeword3_4 {

	public static void main(String[] args) {

		int nm = 0;
		System.out.println("請輸入一個你討厭的數字(1~9)：");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			nm = sc.nextInt();
		}

		// ==============================================

		if (nm < 10 && nm != 0) {

			int sum = 0;
			for (int i1 = 1; i1 < 10; i1++) {

				if (nm != i1) {
					System.out.print(i1 + " ");
					sum++;
				}
			}

			System.out.println();

			for (int i2 = 1; i2 < 5; i2++) {

				if (nm != i2) {

					for (int i3 = 0; i3 < 10; i3++) {
						if (nm != i3) {
							System.out.print(i2);
							System.out.print(i3 + " ");
							sum++;
						}
					}
					System.out.println();
				}
			}
			System.out.print("總共有"+ sum +"個數字可供選擇");
		} else {
			System.out.println("請麻煩輸入1~9中的數字");
		}

	}

}
