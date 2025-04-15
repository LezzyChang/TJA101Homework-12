package hw5;

public class homework5_5 {
	public static void main(String[] args) {

		int[] sum = new int[8]; //宣告陣列

		for (int i = 0; i < sum.length; i++) {
			int rd = (int) (Math.random() * 62); 
			//因0~9,a~z,A~Z總共有62個，將隨機取出
			if (rd < 10) {
				sum[i] = rd + 48; //0~9的數字，從48算起 至57
			} else if (rd < 36) { 
				sum[i] = rd - 10 + 65; //A~Z的編碼從65~90，扣10是為了要避開數字的編碼
			} else {
				sum[i] = rd - 36 + 97; //a~z的編碼從97~122，扣36與上述以此類推。
			}
			System.out.print(sum[i] + " ");
		}
		System.out.println();

		for (int j = 0; j < sum.length; j++) {

			System.out.print((char) sum[j]);
		}

	}

}
