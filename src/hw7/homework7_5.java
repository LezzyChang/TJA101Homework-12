package hw7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class homework7_5 {
	public static void main(String[] args) throws ClassNotFoundException {
		String filePath = "C:\\data\\Object.ser";
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
			Dog dog = (Dog) ois.readObject();
			Cat cat = (Cat) ois.readObject();
			Dog dog1 = (Dog) ois.readObject();
			Cat cat1 = (Cat) ois.readObject();
			
			dog.speak();
			cat.speak();
			dog1.speak();
			cat1.speak();
			
		}catch(FileNotFoundException fn) {
			System.out.println("找不到檔案～");
		}catch(IOException e) {
			System.out.println("讀取資料失敗～"+ e);
		}
		
	}

}
