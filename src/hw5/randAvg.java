package hw5;

public class randAvg {
	public int mathAverage() {
		int max =0;
		
		int[] sum = new int[10];
		
		for(int i = 0;i<sum.length;i++) {
			sum[i] = (int)(Math.random()*100);
			System.out.print(sum[i]+" ");
			max += sum[i];
		}
		System.out.println();
		max = max/sum.length;
		return max;
	}

}
