package hw2;

public class hw2_2 {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int s1 = 1;
		for (int s2 = 1; s2 <= 10; s2++) {
			s1 *= s2; // s1=1*1 ,s2=1*2
		}
		System.out.println(s1);
		//while
		int f1 =1;
		int f2 =1;
		while(f2++ < 10) {
			f1 *= f2;
		}
		System.out.println(f1);
		// do while
		int h1 =1;
		int h2 =0;
		do {
			h2++;
			h1 *= h2;
		}while(h2 < 10);
		System.out.println(h1);
	}

}
