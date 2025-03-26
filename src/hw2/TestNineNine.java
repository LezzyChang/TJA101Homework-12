package hw2;

public class TestNineNine {
	public static void main(String[] args) {

//		int num1;
//		for(int i =1;i<9;i++) {
//			for (int b =1;b<=9;b++) {
//				num1 = i*b;
//				String f1 = i+"*"+b+"=";
//				System.out.print(f1 + num1 +" \t");
//			}
//			System.out.println();
//		}

		int c1 = 1;
		while (c1 <= 9) {
			int t1 = 1;
			while (t1 <= 9) {
				System.out.print(t1 + "*" + c1 + "=" + c1 * t1 + "\t");
				t1++;
			}
			c1++;
			System.out.println();
		}
	}
}