package hw4;

import java.util.Scanner;

public class homework4_4 {
	public static void main(String[] args) {
		int[] allDays = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("請依順序輸入西元年,月份,日;");
		for (int i = 0; i < allDays.length; i++) {
			allDays[i] = sc.nextInt();
		}
		System.out.println("西元" + allDays[0] + "年" + allDays[1] + "月" + allDays[2] + "日");

		// ==============================
		int days = 0;
		int daysInt = allDays[1];

		if (allDays[0] % 4 == 0) {
			for (int sum = 1; sum <= daysInt; sum++) {
				if (sum == 2) {
					if (allDays[1] == 2 && allDays[2] < 29) {
						days += allDays[2];
						continue;
					} else if (allDays[1] == 2 && allDays[2] == 29) {
						days += 29;
						continue;
					} else if (allDays[1] > 2 && (allDays[2] > 29 || allDays[2] < 29)) {
						if (allDays[2] > 29) {
							days += 29;
							continue;
						} else {
							days += allDays[2];
							continue;
						}
					} else {
						days = 0;
						break;
					}
				}
				// 4 6 9 11月 30日算法
				if (sum == 4 || sum == 6 || sum == 9 || sum == 11) {
					if (allDays[2] <= 30) {
						if (sum < allDays[1])
							days += 30;
						continue;
					} else if (allDays[1] == sum && allDays[2] < 31) {
						days += allDays[2];
						continue;
					} else {
						days += 30;
						continue;
					}
					// 1 3 5 7 9月 30日算法
				} else if (sum == 1 || sum == 3 || sum == 5 || sum == 7 || sum == 8 || sum == 10 || sum == 12) {
					if (allDays[2] <= 31) {
						if (sum < allDays[1]) {
							days += 31;
							continue;
						} else if (allDays[1] == sum && allDays[2] < 31) {
							days += allDays[2];
							continue;
						} else {
							days += 31;
							continue;
						}

					} else {
						days = 0;
						break;
					}
				}
			}

		} else {
			for (int sum = 1; sum <= daysInt; sum++) {
				if (sum == 2) {
					if (allDays[1] == 2 && allDays[2] < 28) {
						days += allDays[2];
						continue;
					} else if (allDays[1] == 2 && allDays[2] == 28) {
						days += 28;
						continue;
					} else if (allDays[1] > 2 && (allDays[2] > 28 || allDays[2] < 28)) {
						if (allDays[2] > 28) {
							days += 28;
							continue;
						} else {
							days += allDays[2];
							continue;
						}
					} else {
						days = 0;
						break;
					}
				}
				// 4 6 9 11月 30日算法
				if (sum == 4 || sum == 6 || sum == 9 || sum == 11) {
					if (allDays[2] <= 30) {
						if (sum < allDays[1])
							days += 30;
						continue;
					} else if (allDays[1] == sum && allDays[2] < 31) {
						days += allDays[2];
						continue;
					} else {
						days += 30;
						continue;
					}
					// 1 3 5 7 9月 30日算法
				} else if (sum == 1 || sum == 3 || sum == 5 || sum == 7 || sum == 8 || sum == 10 || sum == 12) {
					if (allDays[2] <= 31) {
						if (sum < allDays[1]) {
							days += 31;
							continue;
						} else if (allDays[1] == sum && allDays[2] < 31) {
							days += allDays[2];
							continue;
						} else {
							days += 31;
							continue;
						}

					} else {
						days = 0;
						break;
					}
				}
			}
			

		}
		if (days != 0) {
			System.out.println("那天是西元" + allDays[0] + "年的第" + days + "天");
		} else {
			System.out.println("錯誤日期，請輸入正確且有效日期");
		}

	}
}