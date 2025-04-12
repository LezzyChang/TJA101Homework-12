package hw4;

public class homework4_2 {
	public static void main(String[] args) {
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		char targetChar[] = {'a','e','i','o','u'};
		int Acount = 0;
		int Ecount = 0;
		int Icount = 0;
		int Ocount = 0;
		int Ucount = 0;
		
		for(int i = 0;i < planets.length;i++) {
			String planet = planets[i]; //將陣列的字串轉為單一String
			for(char sum : planet.toCharArray()) {
				//char sum 是每次迴圈當中取得道的字元
				//planet.toCharArray()是要被處理的字串
				//利用for迴圈來進行檢查每個字元
//				char sum = planet.charAt(i);
				switch(sum) {
				case 'a':
					Acount +=1;
					break;
				case 'e':
					Ecount +=1;
					break;
				case 'i':
					Icount +=1;
					break;
				case 'o':
					Ocount +=1;
					break;
				case 'u':
					Ucount +=1;
					break;
				}
			}
			
		}
		System.out.println("這串陣列裡的a，總共有"+Acount+"個");
		System.out.println("這串陣列裡的e，總共有"+Ecount+"個");
		System.out.println("這串陣列裡的i，總共有"+Icount+"個");
		System.out.println("這串陣列裡的o，總共有"+Ocount+"個");
		System.out.println("這串陣列裡的u，總共有"+Ucount+"個");
		int Count = Acount + Ecount + Icount + Ocount + Ucount;
		System.out.println("母音總共有"+Count + "個");
	}

}
