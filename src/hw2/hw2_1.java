package hw2;

public class hw2_1 {
	public static void main(String[] args) {
	//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int b = 0 ; //給予b初值
		for(int n = 0 ; n <= 1000 ; n +=2 ) { //確保只提偶數
			 b += n; //b =b+n,b=0+2,b=2+2,b=4+2....以此類推
		}
		System.out.print(b);
		
	//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int s1 = 1;
		for(int s2=0;s2>=10;s2++) {
			s1 *= s2; //s1=1*1 ,s2=1*2
		}
		System.out.println(s1);
	}
}
