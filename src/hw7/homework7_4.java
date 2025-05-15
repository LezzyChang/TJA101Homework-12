package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class homework7_4 {
	public static void main(String[] args) {
		String path = "C:\\data";
		File fl = new File(path);
		
		//這邊先建立資料夾
		if(!fl.exists()) {
			boolean created = fl.mkdir();
			if(created) {
				System.out.println("資料夾建立成功！");
			}else {
				System.out.println("資料夾建立失敗～");
			}
		}else {
			System.out.println("資料夾本已存在～");
		}
		
		String outputFilePath = path + File.separator + "Object.ser";
		
		Dog dog = new Dog("woof");
		Cat cat = new Cat("meow");
		Dog dog1 = new Dog("tsao");
		Cat cat1 = new Cat("gan");
		
		try {
			FileOutputStream fo = new FileOutputStream(outputFilePath);
			ObjectOutputStream op = new ObjectOutputStream(fo);
			
			op.writeObject(dog);
			op.writeObject(cat);
			op.writeObject(dog1);
			op.writeObject(cat1);
			System.out.println("已成功將dog&cat物件寫入Object.ser裡");
			op.close();
			fo.close();
			
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
		
	}

}
