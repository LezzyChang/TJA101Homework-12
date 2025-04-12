package hw4;

public class homework4_1 {
	public static void main(String args[]) {
		//4-1.找出平均值及大於平均值
		int m1[]= {29,100,39,41,50,8,66,77,95,15};
		int m2=0;
		for(int m3=0; m3 < m1.length ; m3++) {
			m2=m2+m1[m3];	
		}
//		System.out.println(m2);
		System.out.println("此陣列的平均值為"+ m2 / m1.length);
		int average1 = (m2/m1.length);
		System.out.print("而大於平均值的元素為");
		for(int m3=0; m3 < m1.length ; m3++) {
			if(m1[m3]>average1) {
				System.out.print(m1[m3] + " ");
			}
		}
		System.out.println();
		//4-2.Hello World 倒敘
		String h1 = "Hello World";

		for (int i = 10; i >= 0; i--) {
			char ch = h1.charAt(i);
			System.out.print(ch);
		}
		
		
		
			
	}
	

}
