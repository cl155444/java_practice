package com.kh.loop;

import java.util.Scanner;

public class WhileInputSum {
	public void inputSum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int number = sc.nextInt();
		int sum = 0;
		
		while(number != 0) {
			sum += number;
			System.out.print("숫자 입력 > ");
			number = sc.nextInt(); // 이거 안적어서 무한반복 발생
		}
		System.out.print("총 합 : " + sum);
	}

}
