package hw2;

public class hw2_3 {
	public static void main(String[] args) {
		int s2 = 0;
		for (int n = 0; n < 100; n++) {
			if (n % 2 == 1) {
				s2 += n;
				if (s2 <= 100)
					System.out.println(s2);
			}
		}
	}
}