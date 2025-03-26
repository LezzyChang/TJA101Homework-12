package hw2;

public class hw2_4 {
	public static void main(String[] args) {
		int count = 0;
		int f = 0;
		do {
			f++;
			if (f != 4) {
				System.out.print(f + " ");
				count++;
			}
		} while (f < 9);
		System.out.println();
//======================================以下十位數
		for (int n = 1; n < 5; ++n) {
			if (n != 4) {
				for (int b = 0; b < 10; ++b) {
					if (b != 4) {
						count++;
						System.out.print(n);
						System.out.print(b + " ");
					}
				}
				System.out.println();
			}
		}
		System.out.println("總共有"+count+"個數字可以選");
	}
}