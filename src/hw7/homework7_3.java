package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class homework7_3 {
	public static void main(String[] args) {
		
		File inpf = new File("cpy.txt");
		File otpf = new File("otp.txt");

		try {
			boolean created = inpf.createNewFile();
			boolean created1 = otpf.createNewFile();
			if (created && created1) {
				System.out.println("兩個檔案建立成功");
			} else {
				System.out.println("檔案已存在，未建立新檔");
			}
		} catch (IOException e) {
			System.out.println("發生錯誤");
		}

		try {
			FileOutputStream fos = new FileOutputStream("C:\\TJA101_Workspace\\Homework-12\\cpy.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream ps = new PrintStream(bos);

			ps.println("1122334455");
			System.out.println("inpf的cpy.txt檔案已被寫入！~");
			ps.close();
			bos.close();
			fos.close();
		} catch (IOException f) {
			System.out.println(f);
		}

		try {
			//呼叫copyFile方法並傳入File參數
			copyFile(inpf, otpf);

		} catch (IOException ioe) {
			System.out.println(ioe);
		}

	}

	public static void copyFile(File inpf, File otpf) throws IOException {
		FileInputStream in = new FileInputStream(inpf);
		FileOutputStream out = new FileOutputStream(otpf);

		int i;

		while ((i = in.read()) != -1) {
			out.write(i);
			System.out.print((char) i);
			System.out.flush();
			
		}
		in.close();
		out.close();
		System.out.println("已完成複製寫入給otpf的otp.txt！");
	}

}
