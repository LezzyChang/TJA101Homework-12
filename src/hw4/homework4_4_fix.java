package hw4;

import java.util.Scanner;

public class homework4_4_fix {
	public static void main(String[] args) {
		//此做法有參考chatGpt的作法，並自己增加註解解釋
		Scanner sc = new Scanner(System.in);
		int[] allDays = new int[3];
		System.out.println("請依順序輸入西元年,月,日");
		for(int i = 0;i<3;i++) {
			allDays[i] = sc.nextInt();
		}
		
		int year = allDays[0];
		int month = allDays[1];
		int day = allDays[2];
		//這邊先設立平年日數
		int[] daysInMonth = {31 ,28 ,31 ,30 ,31,30,31,31,30,31,30,31};
		//遇到閏年處理,若符合閏年條件，將2月天數改成29
		if(isLeapYear(year)) {
			daysInMonth[1] = 29;
		}
		//這邊是檢查年月日是否正確 ,最後的條件是在檢查，輸入的日是否有超過當月的日期。
		//month-1是因為索引值是從0開始，所以必須先-1才能對到。
		if(month < 1 || month >12 || day <1|| day>daysInMonth[month - 1]) {
			System.out.println("請輸入正確且有效的年月日");
			return;
		}
		
		//先宣告總天數為0
		int totalDays = 0;
		//month-1 是因為要先計算所輸入的月份已經完整過了多少，避免最後的月份。
		for(int j = 0;j < month-1;j++) {
			totalDays += daysInMonth[j];
		}
		totalDays += day;
		//到最後月份的時候，加上該月天數，因為到該月不一定會是滿30或31。
		System.out.println("西元"+year+"年"+month+"月"+day+"日");
		System.out.println("那天是西元" + year + "年的第 " + totalDays + " 天");
	}
		//================================
		//這邊是設立閏年條件方法
		//情況一：可以被4整除，但不能被100整除
		//情況二：可以被400整除
		public static boolean isLeapYear(int year) {
			return (year % 4 ==0 || year % 100 ==0) ||(year %400 ==0);
		}
		
		
		
		
	}


