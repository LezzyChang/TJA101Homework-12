package hw4;

public class homework4_5 {
	public static void main(String[] args) {
		int[][] classMate = { { 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 35, 40, 100, 90, 85, 75, 70 },
				{ 37, 75, 77, 89, 64, 75, 70, 95 }, { 100, 70, 79, 90, 75, 70, 79, 90 },
				{ 77, 95, 70, 89, 60, 75, 85, 89 }, { 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };

//		int member1 = 0,member2=0,member3=0,member4=0,member5=0,member6=0,member7=0,member8=0;

		for (int testcount = 1; testcount < classMate.length; testcount++) {
			int max = classMate[testcount][0];
			for (int i = 0; i < classMate[testcount].length; i++) {
				if (classMate[testcount][i] > max) {
					max = classMate[testcount][i];
				}
//				System.out.println(classMate[testcount].length);
				if (i == (classMate[testcount].length-1)) {
					for (int f = 0; f < classMate[testcount].length; f++) {
						if (max == classMate[testcount][f]) {
							classMate[0][f]++;
						}
					}
				}
			}
			
				
			
		}
		for (int i = 0; i < classMate[0].length; i++) {
			System.out.println("同學" + (i + 1) + "號考到最高分的次數為" + classMate[0][i]);
		}
		
	}

}
