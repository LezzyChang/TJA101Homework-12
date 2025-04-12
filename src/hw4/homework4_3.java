package hw4;

import java.util.Scanner;

public class homework4_3 {
	public static void main(String[] args) {
		int want;
		
		Scanner sc = new Scanner(System.in);
			want = sc.nextInt();
			member(want);
				
		
	}
	
	
	//===============
	public static void member(int want){
		String mmListStr = ""; //建立一個空的字串
		int count= 0;
		int[][] members={ 
				{25,32,8,19,27},
				{2500,800,500,1000,1200}
		};
		for(int i =0; i < members[0].length ; i++) { //這邊指定為元素引索值
			if(members[1][i] > want) { //這邊指定第二個陣列
				mmListStr += members[0][i] + " "; //將陣列的值轉為字串，再利用for迴圈進行串接
				count++;
					
				}
			}
		
		System.out.println("有錢可借的員工編號: " + mmListStr + " 共 " + count + " 人!");
		
	}
		
	
	}
