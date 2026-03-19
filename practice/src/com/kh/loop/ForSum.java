package com.kh.loop;

import java.util.Scanner;

public class ForSum {
	public void sumTest() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int number = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println("총 합 : " + sum);
	}

}
