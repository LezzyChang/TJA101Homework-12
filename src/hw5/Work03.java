package hw5;

public class Work03 {
	public double maxElement(double[][] doubleArray) {
		double max = 0;
		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {
				if (max < doubleArray[i][j]) {
					max = doubleArray[i][j];
				}
			}
		}
		return max;
	}

	public int maxElement(int[][] intArray) {
		int max = 0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				if (max < intArray[i][j]) {
					max = intArray[i][j];
				}
			}
		}
		return max;
	}
}


	
	


