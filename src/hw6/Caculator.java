package hw6;

public class Caculator {
	public void powerXY(int x, int y) throws CalException {

		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義！");
		} else if (x < 0 || y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		}

		int sum = (int) Math.pow(x, y);
		System.out.println(x + "的" + y + "次方等於" + sum);

	}
}