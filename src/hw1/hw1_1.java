package hw1;

public class hw1_1 {
	public static void main(String[] args) {

		// 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int m1 = 12;
		int m2 = 6;
		System.out.println("12+6=" + (m1 + m2));
		System.out.println("12*6=" + m1 * m2);

		// 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		int bag = 12;
		System.out.println("總共" + egg / bag + "打,餘" + egg % bag + "顆");

		// 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int s1 = 256559; // 秒
		int s2 = (s1 % 60); // 秒數除後餘數
		int m3 = ((s1 / 60) % 60);
		int h1 = ((s1 / 60) / 60 % 24);
		int d1 = ((s1 / 60) / 60 / 24);
		System.out.println("分為" + d1 + "天," + h1 + "小時," + m3 + "分與" + s2 + "秒");

		// 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double p1 = 3.1415;
		int r1 = 5;
		System.out.println("園面積:" + (float) (p1 * (r1 * r1)));
		System.out.println("圓周長:" + (float) (p1 * (r1 + r1)));

		/*
		 * 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本 金加利息共有多少錢 (用複利計算,公式請自行google)
		 */
		double mn1 = 1500000; // 初期本金PV
		double x1 = 1.02; // 每期利率R
		double r45 = 1.0;
		// int t1 = 10; // 期數n
		// FV(期末利和) = PV * (1+R)n次方
		for (int n = 0; n < 10; n++) {
			r45 *= x1;
		}
		double mn2 = mn1 * r45;
		System.out.println((int) mn2);
		
		/*請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		 * 5 + 5 , 5 + '5', 5 + "5",並請用註解各別說明答案的產生原因
		 */
		System.out.println(5 +5 ); //5=int整數，所以5+5=10
		System.out.println(5 + '5'); 
		/*前者為int整數5，後者'5'為字元，計算會將字元5轉成int(unicode編碼:53)
		 * 所以 5 + 53 = 58
		 */
		System.out.println(5 + "5");
		// 前者為int5,"5"雙引號內的數值會轉換為字串，int+字串 = 55
	}
}