package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class homework7_2 {
	public static void main(String[] args) throws IOException {
		
		//建立一個FileWriter物件，可將文字寫入Data.txt,第二個參數true，表示「附加模式(append mode)」
		FileWriter fw = new FileWriter("Data.txt" , true);
		//BufferedWriter加上一層緩衝區，更有效率的將文字寫入檔案
		BufferedWriter bw = new BufferedWriter(fw);
		//寫這個只是單純想要寫的方便一點
		PrintWriter out = new PrintWriter(bw);
		
		int[] sum = new int[10];
		for(int i = 0;i<sum.length;i++) {
			sum[i] = (int) (Math.random()*100+1);
			System.out.println(sum[i]);
			out.print(sum[i]+" ");
		}
		out.println();
		out.close();
		
		
		
	}

}
